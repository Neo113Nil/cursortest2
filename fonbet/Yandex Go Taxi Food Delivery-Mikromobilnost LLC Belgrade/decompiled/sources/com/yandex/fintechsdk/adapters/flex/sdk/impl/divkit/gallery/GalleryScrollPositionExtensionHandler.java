package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivGallery;
import defpackage.bpk;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.dnr;
import defpackage.dpk;
import defpackage.eg90;
import defpackage.egk;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.kvo;
import defpackage.qpe0;
import defpackage.rvo;
import defpackage.tcc;
import defpackage.u2l;
import defpackage.v3k;
import defpackage.y131;
import defpackage.y6i0;
import defpackage.y6k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u0000 G2\u00020\u0001:\u0002HGB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J_\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00162\u0006\u0010(\u001a\u00020!H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b4\u00105J/\u00106\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b6\u00107J/\u00108\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b8\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010@\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0?0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/gallery/GalleryScrollPositionExtensionHandler;", "Ldpk;", "Landroid/content/Context;", "context", "Lcom/yandex/div/core/expression/variables/a;", "variableController", "<init>", "(Landroid/content/Context;Lcom/yandex/div/core/expression/variables/a;)V", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "findRecyclerView", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/ViewGroup;", "viewGroup", "findRecyclerViewInHierarchy", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lrvo;", "expressionResolver", "recyclerView", "", "scrollOffsetXVariable", "scrollOffsetYVariable", "scrollRemainingXVariable", "scrollRemainingYVariable", "", "Lv3k;", "onDidScrollActions", "Lzy11;", "setupScrollListener", "(Lcom/yandex/div/core/view2/Div2View;Lrvo;Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "range", "extent", "offset", "computeRemaining", "(III)I", "name", "valuePx", "updateVariable", "(Ljava/lang/String;I)V", "unbindScrollListener", "(Landroid/view/View;)V", "px", "", "pxToDp", "(I)J", "Legk;", "div", "", "matches", "(Legk;)Z", "bindView", "(Lcom/yandex/div/core/view2/Div2View;Lrvo;Landroid/view/View;Legk;)V", "unbindView", "Landroid/content/Context;", "Lcom/yandex/div/core/expression/variables/a;", "Ljava/util/WeakHashMap;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/gallery/GalleryScrollPositionExtensionHandler$ScrollListenerData;", "scrollListeners", "Ljava/util/WeakHashMap;", "Ljava/lang/ref/WeakReference;", "recyclerViewCache", "", "density$delegate", "Li3y;", "getDensity", "()F", "density", "Companion", "ScrollListenerData", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GalleryScrollPositionExtensionHandler implements dpk {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EXTENSION_ID = "gallery_scroll_position";

    @Deprecated
    public static final String PARAM_ON_DID_SCROLL = "on_did_scroll";

    @Deprecated
    public static final String PARAM_SCROLL_OFFSET_X = "scroll_offset_x_variable";

    @Deprecated
    public static final String PARAM_SCROLL_OFFSET_Y = "scroll_offset_y_variable";

    @Deprecated
    public static final String PARAM_SCROLL_REMAINING_X = "scroll_remaining_x_variable";

    @Deprecated
    public static final String PARAM_SCROLL_REMAINING_Y = "scroll_remaining_y_variable";
    private final Context context;
    private final a variableController;
    private final WeakHashMap<View, ScrollListenerData> scrollListeners = new WeakHashMap<>();
    private final WeakHashMap<View, WeakReference<RecyclerView>> recyclerViewCache = new WeakHashMap<>();

    /* renamed from: density$delegate, reason: from kotlin metadata */
    private final i3y density = kotlin.a.a(new dnr(12, this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/gallery/GalleryScrollPositionExtensionHandler$ScrollListenerData;", "", "Landroidx/recyclerview/widget/RecyclerView$g;", "scrollListener", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "component1", "()Landroidx/recyclerview/widget/RecyclerView$g;", "copy", "(Landroidx/recyclerview/widget/RecyclerView$g;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/gallery/GalleryScrollPositionExtensionHandler$ScrollListenerData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/recyclerview/widget/RecyclerView$g;", "getScrollListener", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class ScrollListenerData {
        private final RecyclerView.g scrollListener;

        public ScrollListenerData(RecyclerView.g gVar) {
            this.scrollListener = gVar;
        }

        public static /* synthetic */ ScrollListenerData copy$default(ScrollListenerData scrollListenerData, RecyclerView.g gVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gVar = scrollListenerData.scrollListener;
            }
            return scrollListenerData.copy(gVar);
        }

        /* renamed from: component1, reason: from getter */
        public final RecyclerView.g getScrollListener() {
            return this.scrollListener;
        }

        public final ScrollListenerData copy(RecyclerView.g scrollListener) {
            return new ScrollListenerData(scrollListener);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollListenerData) && jl40.l(this.scrollListener, ((ScrollListenerData) other).scrollListener);
        }

        public final RecyclerView.g getScrollListener() {
            return this.scrollListener;
        }

        public int hashCode() {
            return this.scrollListener.hashCode();
        }

        public String toString() {
            return "ScrollListenerData(scrollListener=" + this.scrollListener + Extension.C_BRAKE;
        }
    }

    public GalleryScrollPositionExtensionHandler(Context context, a aVar) {
        this.context = context;
        this.variableController = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int computeRemaining(int range, int extent, int offset) {
        return Math.max(0, (range - extent) - offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float density_delegate$lambda$0(GalleryScrollPositionExtensionHandler galleryScrollPositionExtensionHandler) {
        return galleryScrollPositionExtensionHandler.context.getResources().getDisplayMetrics().density;
    }

    private final RecyclerView findRecyclerView(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        WeakReference<RecyclerView> weakReference = this.recyclerViewCache.get(view);
        RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
        if (recyclerView != null) {
            return recyclerView;
        }
        RecyclerView findRecyclerViewInHierarchy = findRecyclerViewInHierarchy((ViewGroup) view);
        if (findRecyclerViewInHierarchy != null) {
            this.recyclerViewCache.put(view, new WeakReference<>(findRecyclerViewInHierarchy));
        }
        return findRecyclerViewInHierarchy;
    }

    private final RecyclerView findRecyclerViewInHierarchy(ViewGroup viewGroup) {
        RecyclerView findRecyclerViewInHierarchy;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (findRecyclerViewInHierarchy = findRecyclerViewInHierarchy((ViewGroup) childAt)) != null) {
                return findRecyclerViewInHierarchy;
            }
        }
        return null;
    }

    private final float getDensity() {
        return ((Number) this.density.getValue()).floatValue();
    }

    private final long pxToDp(int px) {
        return (long) (px / getDensity());
    }

    private final void setupScrollListener(final Div2View divView, final rvo expressionResolver, RecyclerView recyclerView, final String scrollOffsetXVariable, final String scrollOffsetYVariable, final String scrollRemainingXVariable, final String scrollRemainingYVariable, final List<v3k> onDidScrollActions) {
        RecyclerView.g gVar = new RecyclerView.g() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery.GalleryScrollPositionExtensionHandler$setupScrollListener$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.g
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                int computeRemaining;
                int computeRemaining2;
                y6k actionHandler;
                GalleryScrollPositionExtensionHandler.this.updateVariable(scrollOffsetXVariable, recyclerView2.computeHorizontalScrollOffset());
                GalleryScrollPositionExtensionHandler.this.updateVariable(scrollOffsetYVariable, recyclerView2.computeVerticalScrollOffset());
                GalleryScrollPositionExtensionHandler galleryScrollPositionExtensionHandler = GalleryScrollPositionExtensionHandler.this;
                String str = scrollRemainingXVariable;
                computeRemaining = galleryScrollPositionExtensionHandler.computeRemaining(recyclerView2.computeHorizontalScrollRange(), recyclerView2.computeHorizontalScrollExtent(), recyclerView2.computeHorizontalScrollOffset());
                galleryScrollPositionExtensionHandler.updateVariable(str, computeRemaining);
                GalleryScrollPositionExtensionHandler galleryScrollPositionExtensionHandler2 = GalleryScrollPositionExtensionHandler.this;
                String str2 = scrollRemainingYVariable;
                computeRemaining2 = galleryScrollPositionExtensionHandler2.computeRemaining(recyclerView2.computeVerticalScrollRange(), recyclerView2.computeVerticalScrollExtent(), recyclerView2.computeVerticalScrollOffset());
                galleryScrollPositionExtensionHandler2.updateVariable(str2, computeRemaining2);
                List<v3k> list = onDidScrollActions;
                if (list != null) {
                    rvo rvoVar = expressionResolver;
                    Div2View div2View = divView;
                    for (v3k v3kVar : list) {
                        if (((Boolean) v3kVar.b.a(rvoVar)).booleanValue() && (actionHandler = div2View.getActionHandler()) != null) {
                            actionHandler.handleAction(v3kVar, div2View, rvoVar);
                        }
                    }
                }
            }
        };
        recyclerView.addOnScrollListener(gVar);
        this.scrollListeners.put(recyclerView, new ScrollListenerData(gVar));
    }

    private final void unbindScrollListener(View view) {
        WeakReference<RecyclerView> weakReference;
        RecyclerView recyclerView;
        ScrollListenerData remove;
        ScrollListenerData remove2 = this.scrollListeners.remove(view);
        if (remove2 != null && (view instanceof RecyclerView)) {
            ((RecyclerView) view).removeOnScrollListener(remove2.getScrollListener());
        } else {
            if (!(view instanceof ViewGroup) || (weakReference = this.recyclerViewCache.get(view)) == null || (recyclerView = weakReference.get()) == null || (remove = this.scrollListeners.remove(recyclerView)) == null) {
                return;
            }
            recyclerView.removeOnScrollListener(remove.getScrollListener());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVariable(String name, int valuePx) {
        if (name == null) {
            return;
        }
        this.variableController.i(new y131(name, pxToDp(valuePx)));
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public void bindView(Div2View divView, rvo expressionResolver, View view, egk div) {
        List extensions;
        Object obj;
        JSONObject jSONObject;
        ArrayList arrayList;
        if (matches(div) && (extensions = div.getExtensions()) != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, EXTENSION_ID)) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            Object opt = jSONObject.opt(PARAM_SCROLL_OFFSET_X);
            String str = opt instanceof String ? (String) opt : null;
            Object opt2 = jSONObject.opt(PARAM_SCROLL_OFFSET_Y);
            String str2 = opt2 instanceof String ? (String) opt2 : null;
            Object opt3 = jSONObject.opt(PARAM_SCROLL_REMAINING_X);
            String str3 = opt3 instanceof String ? (String) opt3 : null;
            Object opt4 = jSONObject.opt(PARAM_SCROLL_REMAINING_Y);
            String str4 = opt4 instanceof String ? (String) opt4 : null;
            u2l u2lVar = new u2l(eg90.b);
            JSONArray optJSONArray = jSONObject.optJSONArray(PARAM_ON_DID_SCROLL);
            if (optJSONArray != null) {
                d6w n = y6i0.n(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList(tcc.n(n, 10));
                c6w it2 = n.iterator();
                while (it2.c) {
                    int nextInt = it2.nextInt();
                    kvo kvoVar = v3k.m;
                    arrayList2.add(kp50.p(u2lVar, optJSONArray.getJSONObject(nextInt)));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            unbindScrollListener(view);
            RecyclerView findRecyclerView = findRecyclerView(view);
            if (findRecyclerView != null) {
                setupScrollListener(divView, expressionResolver, findRecyclerView, str, str2, str3, str4, arrayList);
            }
        }
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void loadMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public boolean matches(egk div) {
        List list;
        if (!(div instanceof DivGallery) || (list = ((DivGallery) div).n) == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, EXTENSION_ID)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void preprocess(egk egkVar, rvo rvoVar, qpe0 qpe0Var) {
        super.preprocess(egkVar, rvoVar, qpe0Var);
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void releaseMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public void unbindView(Div2View divView, rvo expressionResolver, View view, egk div) {
        unbindScrollListener(view);
        this.recyclerViewCache.remove(view);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/gallery/GalleryScrollPositionExtensionHandler$Companion;", "", "<init>", "()V", "EXTENSION_ID", "", "PARAM_SCROLL_OFFSET_X", "PARAM_SCROLL_OFFSET_Y", "PARAM_SCROLL_REMAINING_X", "PARAM_SCROLL_REMAINING_Y", "PARAM_ON_DID_SCROLL", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void preprocess(egk egkVar, rvo rvoVar) {
    }
}
