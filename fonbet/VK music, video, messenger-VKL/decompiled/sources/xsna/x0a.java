package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;

/* compiled from: CatalogAnimationDialogCallbackFactory.kt */
/* loaded from: classes16.dex */
public final class x0a {
    public final gzs<ViewGroup> a;
    public final gzs<View> b;
    public final Rect c = new Rect();
    public final int[] d = {0, 0};

    /* compiled from: CatalogAnimationDialogCallbackFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0a(gzs<? extends ViewGroup> gzsVar, gzs<? extends View> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    public static final View a(x0a x0aVar, VideoFile videoFile) {
        ViewGroup invoke;
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView;
        RecyclerView recyclerView;
        tca c;
        View view;
        View invoke2 = x0aVar.b.invoke();
        if (videoFile != null && (invoke = x0aVar.a.invoke()) != null && (catalogRecyclerPaginatedView = (CatalogRecyclerPaginatedView) invoke.findViewById(R.id.paginated_list)) != null && (recyclerView = catalogRecyclerPaginatedView.getRecyclerView()) != null && (c = c(recyclerView, new tl0(videoFile, 19))) != null && (view = c.itemView) != null) {
            invoke2 = view;
        }
        if (invoke2 != null) {
            return invoke2.findViewById(R.id.preview);
        }
        return null;
    }

    public static y0a b(x0a x0aVar, VideoFile videoFile, int i) {
        yg5 yg5Var;
        if ((i & 1) != 0) {
            videoFile = null;
        }
        x0aVar.getClass();
        if (videoFile != null) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5Var = b.C1208b.a().e(videoFile, null);
        } else {
            yg5Var = null;
        }
        return new y0a(yg5Var, x0aVar, videoFile, null);
    }

    public static tca c(RecyclerView recyclerView, tl0 tl0Var) {
        RecyclerView recyclerView2;
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (true) {
            tca tcaVar = null;
            if (i >= childCount) {
                return null;
            }
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(childAt);
                tca tcaVar2 = childViewHolder instanceof tca ? (tca) childViewHolder : null;
                if (tcaVar2 != null) {
                    if (tcaVar2.n instanceof UIBlockList) {
                        RecyclerPaginatedView recyclerPaginatedView = childAt instanceof RecyclerPaginatedView ? (RecyclerPaginatedView) childAt : null;
                        if (recyclerPaginatedView != null && (recyclerView2 = recyclerPaginatedView.getRecyclerView()) != null) {
                            tcaVar = c(recyclerView2, tl0Var);
                        }
                        if (tcaVar != null) {
                            return tcaVar;
                        }
                    }
                    if (((Boolean) tl0Var.invoke(tcaVar2)).booleanValue()) {
                        return tcaVar2;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }
}
