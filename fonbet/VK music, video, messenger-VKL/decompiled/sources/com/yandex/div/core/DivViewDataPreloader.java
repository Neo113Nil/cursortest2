package com.yandex.div.core;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div2.a;
import com.yandex.div2.td;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.s3q0;

/* compiled from: DivViewDataPreloader.kt */
/* loaded from: classes7.dex */
public class DivViewDataPreloader {
    private final DivCustomContainerViewAdapter customContainerViewAdapter;
    private final DivExtensionController extensionController;
    private final DivImagePreloader imagePreloader;
    private final DivPreloader.PreloadFilter preloadFilter;
    private final DivPlayerPreloader videoPreloader;

    /* compiled from: DivViewDataPreloader.kt */
    public final class PreloadVisitor extends DivTreeVisitor<s3q0> {
        private final DivPreloader.Callback callback;
        private final DivPreloader.DownloadCallback downloadCallback;
        private final DivPreloader.PreloadFilter preloadFilter;
        private final DivPreloader.TicketImpl ticket;

        /* JADX WARN: Multi-variable type inference failed */
        public PreloadVisitor(DivPreloader.DownloadCallback downloadCallback, DivPreloader.Callback callback, DivPreloader.PreloadFilter preloadFilter) {
            super(null, 1, 0 == true ? 1 : 0);
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.preloadFilter = preloadFilter;
            this.ticket = new DivPreloader.TicketImpl();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ s3q0 defaultVisit(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(aVar, bindingContext, divStatePath);
            return s3q0.a;
        }

        public final DivPreloader.Ticket preload(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit(aVar, bindingContext, divStatePath);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.b bVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(bVar, bindingContext, divStatePath);
            return s3q0.a;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
            List<LoadReference> preloadImage;
            DivImagePreloader divImagePreloader = DivViewDataPreloader.this.imagePreloader;
            if (divImagePreloader != null && (preloadImage = divImagePreloader.preloadImage(aVar, bindingContext.getExpressionResolver(), this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = preloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivViewDataPreloader.this.extensionController.preprocessExtensions(aVar.b(), bindingContext.getExpressionResolver());
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.q qVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(qVar, bindingContext, divStatePath);
            return s3q0.a;
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.b bVar, BindingContext bindingContext, DivStatePath divStatePath) {
            super.visit(bVar, bindingContext, divStatePath);
            this.ticket.addReference(DivViewDataPreloader.this.customContainerViewAdapter.preload(bVar.c, this.callback));
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.q qVar, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2((a) qVar, bindingContext, divStatePath);
            if (this.preloadFilter.shouldPreloadContent(qVar, bindingContext.getExpressionResolver())) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = qVar.c.Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((td) it.next()).d.evaluate(bindingContext.getExpressionResolver()));
                }
                this.ticket.addReference(DivViewDataPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    public DivViewDataPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, DivPlayerPreloader divPlayerPreloader, DivPreloader.PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    public static /* synthetic */ DivPreloader.Ticket preload$default(DivViewDataPreloader divViewDataPreloader, a aVar, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i & 8) != 0) {
            callback = DivPreloader.Companion.getNO_CALLBACK$div_release();
        }
        return divViewDataPreloader.preload(aVar, bindingContext, divStatePath, callback);
    }

    public DivPreloader.Ticket preload(a aVar, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback) {
        DivPreloader.DownloadCallback downloadCallback = new DivPreloader.DownloadCallback(callback);
        DivPreloader.Ticket preload = new PreloadVisitor(downloadCallback, callback, this.preloadFilter).preload(aVar, bindingContext, divStatePath);
        downloadCallback.onFullPreloadStarted();
        return preload;
    }
}
