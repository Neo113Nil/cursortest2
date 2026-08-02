package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogActionFilterStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: VideoCatalogTabletHorizontalDecorator.kt */
/* loaded from: classes16.dex */
public final class fas0 extends i9s0 {
    public static final int u = iah0.a(4);
    public static final int v = iah0.a(8);
    public static final int w;
    public static final int x;

    /* compiled from: VideoCatalogTabletHorizontalDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_MINIMALISTIC_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.CAROUSEL_CLIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.SEARCH_CAROUSEL_CLIPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_SLIDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_SLIDER_HIDE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogViewType.FLOOR_CLIPS.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogViewType.SEARCH_FLOOR_CLIPS.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        iah0.a(10);
        w = iah0.a(15);
        x = iah0.a(32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0150, code lost:
    
        if (r1 == null) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v32 */
    @Override // xsna.i9s0, xsna.pca, androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        UIBlockList uIBlockList;
        boolean z;
        UIBlockList uIBlockList2;
        boolean z2;
        UIBlockList uIBlockList3;
        boolean z3;
        UIBlockList uIBlockList4;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.d.getClass();
        UIBlock b = b4a.b(childAdapterPosition, adapter);
        r1 = null;
        String str = null;
        r1 = null;
        String str2 = null;
        r1 = null;
        String str3 = null;
        r1 = null;
        String str4 = null;
        CatalogViewType catalogViewType = b != null ? b.d : null;
        CatalogDataType catalogDataType = b != null ? b.e : null;
        VideoCatalogViewStyle videoCatalogViewStyle = b != null ? b.l : null;
        int i = catalogDataType == null ? -1 : a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
        int i2 = v;
        int i3 = pca.n;
        boolean z4 = true;
        int i4 = x;
        switch (i) {
            case 1:
                int i5 = catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1;
                if (i5 == 1) {
                    if (recyclerView.getChildAdapterPosition(view) != 0) {
                        super.getItemOffsets(rect, view, recyclerView, a0Var);
                        break;
                    } else {
                        rect.set(i4, 0, i2, 0);
                        break;
                    }
                } else if (i5 == 2) {
                    VideoCatalogViewStyle videoCatalogViewStyle2 = videoCatalogViewStyle instanceof VideoCatalogViewStyle ? videoCatalogViewStyle : null;
                    if (videoCatalogViewStyle2 != null) {
                        if (videoCatalogViewStyle2.b == VideoCatalogViewStyle.Style.AuthorVideos) {
                            if (recyclerView.getChildAdapterPosition(view) != 0) {
                                super.getItemOffsets(rect, view, recyclerView, a0Var);
                                break;
                            } else {
                                rect.set(i4, 0, i2, 0);
                                break;
                            }
                        }
                    }
                    super.getItemOffsets(rect, view, recyclerView, a0Var);
                    break;
                } else {
                    super.getItemOffsets(rect, view, recyclerView, a0Var);
                    break;
                }
            case 2:
                int childAdapterPosition2 = recyclerView.getChildAdapterPosition(view);
                boolean z5 = childAdapterPosition2 == 0;
                if (childAdapterPosition2 == b4a.c(recyclerView.getAdapter()) - 1) {
                    jpf jpfVar = this.c;
                    if (jpfVar != null && (uIBlockList = (UIBlockList) jpfVar.invoke()) != null) {
                        str4 = uIBlockList.A;
                        break;
                    }
                }
                z4 = false;
                switch (catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) {
                    case 1:
                    case 7:
                    case 8:
                        if (!z5) {
                            if (!z4) {
                                rect.set(i3, 0, 0, 0);
                                break;
                            } else {
                                rect.set(i3, 0, i4, 0);
                                break;
                            }
                        } else {
                            rect.set(i4, 0, 0, 0);
                            break;
                        }
                    case 2:
                    default:
                        super.getItemOffsets(rect, view, recyclerView, a0Var);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        if (!z5) {
                            if (!z4) {
                                rect.set(i3, 0, 0, 0);
                                break;
                            } else {
                                rect.set(i3, 0, i4, 0);
                                break;
                            }
                        } else {
                            rect.set(i4, 0, 0, 0);
                            break;
                        }
                    case 9:
                    case 10:
                        rect.set(i2, 0, i2, i3);
                        break;
                }
            case 3:
                int childAdapterPosition3 = recyclerView.getChildAdapterPosition(view);
                boolean z6 = childAdapterPosition3 == 0;
                if (childAdapterPosition3 == b4a.c(recyclerView.getAdapter()) - 1) {
                    jpf jpfVar2 = this.c;
                    if (jpfVar2 != null && (uIBlockList2 = (UIBlockList) jpfVar2.invoke()) != null) {
                        str3 = uIBlockList2.A;
                    }
                    if (str3 == null) {
                        z = true;
                        if ((catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) == 1) {
                            super.getItemOffsets(rect, view, recyclerView, a0Var);
                            break;
                        } else {
                            int i6 = pca.o;
                            if (!z6) {
                                int i7 = w;
                                if (!z) {
                                    rect.set(i7, i6, 0, 0);
                                    break;
                                } else {
                                    rect.set(i7, i6, i4, 0);
                                    break;
                                }
                            } else {
                                rect.set(i4, i6, 0, 0);
                                break;
                            }
                        }
                    }
                }
                z = false;
                if ((catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) == 1) {
                }
                break;
            case 4:
                int childAdapterPosition4 = recyclerView.getChildAdapterPosition(view);
                boolean z7 = childAdapterPosition4 == 0;
                if (childAdapterPosition4 == b4a.c(recyclerView.getAdapter()) - 1) {
                    jpf jpfVar3 = this.c;
                    if (jpfVar3 != null && (uIBlockList3 = (UIBlockList) jpfVar3.invoke()) != null) {
                        str2 = uIBlockList3.A;
                    }
                    if (str2 == null) {
                        z2 = true;
                        if ((catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) == 1) {
                            super.getItemOffsets(rect, view, recyclerView, a0Var);
                            break;
                        } else if (!(videoCatalogViewStyle instanceof CatalogActionFilterStyle) || ((CatalogActionFilterStyle) videoCatalogViewStyle).b != CatalogActionFilterStyle.Style.INLINE) {
                            int i8 = u;
                            if (!z7) {
                                if (!z2) {
                                    rect.set(i8, 0, i8, 0);
                                    break;
                                } else {
                                    rect.set(i8, 0, i4, 0);
                                    break;
                                }
                            } else {
                                rect.set(i4, 0, i8, 0);
                                break;
                            }
                        } else {
                            super.getItemOffsets(rect, view, recyclerView, a0Var);
                            break;
                        }
                    }
                }
                z2 = false;
                if ((catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) == 1) {
                }
                break;
            case 5:
            case 6:
                int childAdapterPosition5 = recyclerView.getChildAdapterPosition(view);
                boolean z8 = childAdapterPosition5 == 0;
                if (childAdapterPosition5 == b4a.c(recyclerView.getAdapter()) - 1) {
                    jpf jpfVar4 = this.c;
                    if (jpfVar4 != null && (uIBlockList4 = (UIBlockList) jpfVar4.invoke()) != null) {
                        str = uIBlockList4.A;
                    }
                    if (str == null) {
                        z3 = true;
                        if ((catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) == 1) {
                            super.getItemOffsets(rect, view, recyclerView, a0Var);
                            break;
                        } else if (!z8) {
                            if (!z3) {
                                rect.set(i3, 0, 0, 0);
                                break;
                            } else {
                                rect.set(i3, 0, i4, 0);
                                break;
                            }
                        } else {
                            rect.set(i4, 0, 0, 0);
                            break;
                        }
                    }
                }
                z3 = false;
                if ((catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) == 1) {
                }
                break;
            default:
                super.getItemOffsets(rect, view, recyclerView, a0Var);
                break;
        }
    }
}
