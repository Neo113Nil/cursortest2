package com.yandex.div.core.view2;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.a;
import com.yandex.div2.m1;
import com.yandex.div2.ma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.s3q0;

/* compiled from: DivImagePreloader.kt */
/* loaded from: classes7.dex */
public class DivImagePreloader {
    private final DivImageLoader imageLoader;

    /* compiled from: DivImagePreloader.kt */
    public final class PreloadVisitor extends DivVisitor<s3q0> {
        private final DivPreloader.DownloadCallback callback;
        private final DivPreloader.PreloadFilter preloadFilter;
        private final ArrayList<LoadReference> references = new ArrayList<>();
        private final ExpressionResolver resolver;
        private final boolean visitContainers;

        public PreloadVisitor(DivPreloader.DownloadCallback downloadCallback, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, boolean z) {
            this.callback = downloadCallback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
            this.visitContainers = z;
        }

        private final void visitBackground(a aVar, ExpressionResolver expressionResolver) {
            List<m1> background = aVar.b().getBackground();
            if (background != null) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                for (m1 m1Var : background) {
                    if ((m1Var instanceof m1.a) && this.preloadFilter.shouldPreloadBackground(m1Var, expressionResolver)) {
                        divImagePreloader.preloadImage(((m1.a) m1Var).b.e.evaluate(expressionResolver).toString(), this.callback, this.references);
                    }
                }
            }
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 defaultVisit(a aVar, ExpressionResolver expressionResolver) {
            defaultVisit2(aVar, expressionResolver);
            return s3q0.a;
        }

        public final List<LoadReference> preload(a aVar) {
            visit(aVar, this.resolver);
            return this.references;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.C2110a c2110a, ExpressionResolver expressionResolver) {
            visit2(c2110a, expressionResolver);
            return s3q0.a;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(a aVar, ExpressionResolver expressionResolver) {
            visitBackground(aVar, expressionResolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.d dVar, ExpressionResolver expressionResolver) {
            visit2(dVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return s3q0.a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ s3q0 visit(a.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
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
        public /* bridge */ /* synthetic */ s3q0 visit(a.p pVar, ExpressionResolver expressionResolver) {
            visit2(pVar, expressionResolver);
            return s3q0.a;
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.p pVar, ExpressionResolver expressionResolver) {
            List<DivText.Image> list;
            defaultVisit2((a) pVar, expressionResolver);
            if (!this.preloadFilter.shouldPreloadContent(pVar, expressionResolver) || (list = pVar.c.F) == null) {
                return;
            }
            DivImagePreloader divImagePreloader = DivImagePreloader.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divImagePreloader.preloadImage(((DivText.Image) it.next()).i.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.f fVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) fVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(fVar, expressionResolver)) {
                DivImagePreloader.this.preloadImage(fVar.c.B.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.d dVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) dVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(dVar, expressionResolver)) {
                DivImagePreloader.this.preloadImageBytes(dVar.c.u.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.C2110a c2110a, ExpressionResolver expressionResolver) {
            defaultVisit2((a) c2110a, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(c2110a.c, expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.e eVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) eVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(eVar.c).iterator();
                while (it.hasNext()) {
                    visit((a) it.next(), expressionResolver);
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.c cVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) cVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(cVar.c, expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.i iVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) iVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(iVar.c, expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.o oVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) oVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = oVar.c.q.iterator();
                while (it.hasNext()) {
                    visit(((DivTabs.a) it.next()).a, expressionResolver);
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(a.m mVar, ExpressionResolver expressionResolver) {
            defaultVisit2((a) mVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = mVar.c.I.iterator();
                while (it.hasNext()) {
                    a aVar = ((ma.a) it.next()).c;
                    if (aVar != null) {
                        visit(aVar, expressionResolver);
                    }
                }
            }
        }
    }

    public DivImagePreloader(DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImageBytes(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImageBytes(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }

    public List<LoadReference> preloadImage(a aVar, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, DivPreloader.DownloadCallback downloadCallback) {
        return new PreloadVisitor(downloadCallback, expressionResolver, preloadFilter, false).preload(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImage(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImage(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }
}
