package com.yandex.div.core;

import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.a;
import com.yandex.div2.m1;
import com.yandex.div2.ma;
import com.yandex.div2.td;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.gq;
import xsna.oon;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DivPreloader.kt */
/* loaded from: classes7.dex */
public class DivPreloader {
    public static final Companion Companion = new Companion(null);
    private static final Callback NO_CALLBACK = new gq(12);
    private final DivCustomContainerViewAdapter customContainerViewAdapter;
    private final DivExtensionController extensionController;
    private final DivImagePreloader imagePreloader;
    private final PreloadFilter preloadFilter;
    private final DivPlayerPreloader videoPreloader;

    /* compiled from: DivPreloader.kt */
    public interface Callback {
        void finish(boolean z);
    }

    /* compiled from: DivPreloader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Callback getNO_CALLBACK$div_release() {
            return DivPreloader.NO_CALLBACK;
        }

        private Companion() {
        }
    }

    /* compiled from: DivPreloader.kt */
    public static final class DownloadCallback extends DivImageDownloadCallback {
        private final Callback callback;
        private int downloadsLeftCount;
        private int failures;
        private boolean started;

        public DownloadCallback(Callback callback) {
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void done() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$done$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.downloadsLeftCount--;
                        if (DivPreloader.DownloadCallback.this.downloadsLeftCount == 0 && DivPreloader.DownloadCallback.this.started) {
                            DivPreloader.DownloadCallback.this.callback.finish(DivPreloader.DownloadCallback.this.failures != 0);
                        }
                    }
                });
                return;
            }
            this.downloadsLeftCount--;
            if (this.downloadsLeftCount == 0 && this.started) {
                this.callback.finish(this.failures != 0);
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onError() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onError$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.failures++;
                        DivPreloader.DownloadCallback.this.done();
                    }
                });
            } else {
                this.failures++;
                done();
            }
        }

        public final void onFullPreloadStarted() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onFullPreloadStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.started = true;
                        if (DivPreloader.DownloadCallback.this.downloadsLeftCount == 0) {
                            DivPreloader.DownloadCallback.this.callback.finish(DivPreloader.DownloadCallback.this.failures != 0);
                        }
                    }
                });
                return;
            }
            this.started = true;
            if (this.downloadsLeftCount == 0) {
                this.callback.finish(this.failures != 0);
            }
        }

        public final void onSingleLoadingStarted() {
            if (UiThreadHandler.isMainThread()) {
                this.downloadsLeftCount++;
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onSingleLoadingStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.downloadsLeftCount++;
                    }
                });
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(CachedBitmap cachedBitmap) {
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(PictureDrawable pictureDrawable) {
            done();
        }
    }

    /* compiled from: DivPreloader.kt */
    public interface PreloadFilter {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final PreloadFilter ONLY_PRELOAD_REQUIRED_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$ONLY_PRELOAD_REQUIRED_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(m1 m1Var, ExpressionResolver expressionResolver) {
                if (m1Var instanceof m1.a) {
                    return ((m1.a) m1Var).b.f.evaluate(expressionResolver).booleanValue();
                }
                return false;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(a aVar, ExpressionResolver expressionResolver) {
                if (!(aVar instanceof a.p)) {
                    if (aVar instanceof a.q) {
                        return ((a.q) aVar).c.A.evaluate(expressionResolver).booleanValue();
                    }
                    if (aVar instanceof a.f) {
                        return ((a.f) aVar).c.H.evaluate(expressionResolver).booleanValue();
                    }
                    if (aVar instanceof a.d) {
                        return ((a.d) aVar).c.E.evaluate(expressionResolver).booleanValue();
                    }
                    return false;
                }
                List<DivText.Image> list = ((a.p) aVar).c.F;
                if (list != null) {
                    List<DivText.Image> list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        return false;
                    }
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((DivText.Image) it.next()).e.evaluate(expressionResolver).booleanValue()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };
        public static final PreloadFilter PRELOAD_ALL_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$PRELOAD_ALL_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(m1 m1Var, ExpressionResolver expressionResolver) {
                return true;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(a aVar, ExpressionResolver expressionResolver) {
                return true;
            }
        };

        /* compiled from: DivPreloader.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        boolean shouldPreloadBackground(m1 m1Var, ExpressionResolver expressionResolver);

        boolean shouldPreloadContent(a aVar, ExpressionResolver expressionResolver);
    }

    /* compiled from: DivPreloader.kt */
    public final class PreloadVisitor extends DivVisitor<s3q0> {
        private final Callback callback;
        private final DownloadCallback downloadCallback;
        private final PreloadFilter preloadFilter;
        private final ExpressionResolver resolver;
        private final TicketImpl ticket = new TicketImpl();

        public PreloadVisitor(DownloadCallback downloadCallback, Callback callback, ExpressionResolver expressionResolver, PreloadFilter preloadFilter) {
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 defaultVisit(a aVar, ExpressionResolver expressionResolver) {
            defaultVisit2(aVar, expressionResolver);
            return s3q0.a;
        }

        public final Ticket preload(a aVar) {
            visit(aVar, this.resolver);
            return this.ticket;
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.C2110a c2110a, ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(c2110a.c, expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((a) c2110a, expressionResolver);
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(a aVar, ExpressionResolver expressionResolver) {
            List<LoadReference> preloadImage;
            DivImagePreloader divImagePreloader = DivPreloader.this.imagePreloader;
            if (divImagePreloader != null && (preloadImage = divImagePreloader.preloadImage(aVar, expressionResolver, this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = preloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivPreloader.this.extensionController.preprocessExtensions(aVar.b(), expressionResolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.e eVar, ExpressionResolver expressionResolver) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(eVar.c).iterator();
            while (it.hasNext()) {
                visit((a) it.next(), expressionResolver);
            }
            defaultVisit2((a) eVar, expressionResolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.c cVar, ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(cVar.c, expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((a) cVar, expressionResolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.i iVar, ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(iVar.c, expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((a) iVar, expressionResolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.o oVar, ExpressionResolver expressionResolver) {
            Iterator<T> it = oVar.c.q.iterator();
            while (it.hasNext()) {
                visit(((DivTabs.a) it.next()).a, expressionResolver);
            }
            defaultVisit2((a) oVar, expressionResolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.m mVar, ExpressionResolver expressionResolver) {
            Iterator<T> it = mVar.c.I.iterator();
            while (it.hasNext()) {
                a aVar = ((ma.a) it.next()).c;
                if (aVar != null) {
                    visit(aVar, expressionResolver);
                }
            }
            defaultVisit2((a) mVar, expressionResolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.b bVar, ExpressionResolver expressionResolver) {
            List<a> list = bVar.c.q;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    visit((a) it.next(), expressionResolver);
                }
            }
            this.ticket.addReference(DivPreloader.this.customContainerViewAdapter.preload(bVar.c, this.callback));
            defaultVisit2((a) bVar, expressionResolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.C2110a c2110a, ExpressionResolver expressionResolver) {
            visit2(c2110a, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.b bVar, ExpressionResolver expressionResolver) {
            visit2(bVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.i iVar, ExpressionResolver expressionResolver) {
            visit2(iVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.m mVar, ExpressionResolver expressionResolver) {
            visit2(mVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.o oVar, ExpressionResolver expressionResolver) {
            visit2(oVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.q qVar, ExpressionResolver expressionResolver) {
            visit2(qVar, expressionResolver);
            return s3q0.a;
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.q qVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) qVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(qVar, expressionResolver)) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = qVar.c.Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((td) it.next()).d.evaluate(expressionResolver));
                }
                this.ticket.addReference(DivPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    public interface Ticket {
        void cancel();
    }

    /* compiled from: DivPreloader.kt */
    public static final class TicketImpl implements Ticket {
        private final List<PreloadReference> refs = new ArrayList();

        private final PreloadReference toPreloadReference(final LoadReference loadReference) {
            return new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public void cancel() {
                    LoadReference.this.cancel();
                }
            };
        }

        public final void addImageReference(LoadReference loadReference) {
            this.refs.add(toPreloadReference(loadReference));
        }

        public final void addReference(PreloadReference preloadReference) {
            this.refs.add(preloadReference);
        }

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }
    }

    public DivPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, DivPlayerPreloader divPlayerPreloader, PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    public Ticket preload(a aVar, ExpressionResolver expressionResolver, Callback callback) {
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        Ticket preload = new PreloadVisitor(downloadCallback, callback, expressionResolver, this.preloadFilter).preload(aVar);
        downloadCallback.onFullPreloadStarted();
        return preload;
    }

    /* compiled from: DivPreloader.kt */
    public interface PreloadReference {
        public static final Companion Companion = Companion.$$INSTANCE;

        void cancel();

        /* compiled from: DivPreloader.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PreloadReference EMPTY = new oon();

            private Companion() {
            }

            public final PreloadReference getEMPTY() {
                return EMPTY;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EMPTY$lambda$0() {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z) {
    }
}
