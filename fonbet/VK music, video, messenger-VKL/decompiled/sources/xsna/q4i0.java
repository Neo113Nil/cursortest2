package xsna;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackHorizontalPreviewListItemVh;
import com.vk.core.compose.component.defaults.SegmentSize;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.u4i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q4i0 implements izs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q4i0(u4i0 u4i0Var, boolean z, wh50 wh50Var) {
        this.d = u4i0Var;
        this.c = z;
        this.e = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkSegmentedControl.SegmentSize segmentSize;
        switch (this.b) {
            case 0:
                u4i0 u4i0Var = (u4i0) this.d;
                wh50 wh50Var = (wh50) this.e;
                VkSegmentedControl vkSegmentedControl = (VkSegmentedControl) obj;
                int i = u4i0.a.$EnumSwitchMapping$0[((SegmentSize) u4i0Var.b.get((String) ((zak0) u4i0Var.c).getValue())).ordinal()];
                if (i == 1) {
                    segmentSize = VkSegmentedControl.SegmentSize.Medium;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    segmentSize = VkSegmentedControl.SegmentSize.Large;
                }
                vkSegmentedControl.setSegmentSize(segmentSize);
                vkSegmentedControl.setEnabled(!this.c);
                int intValue = ((Number) wh50Var.getValue()).intValue();
                int intValue2 = ((Number) ((zak0) u4i0Var.d).getValue()).intValue();
                boolean booleanValue = ((Boolean) ((zak0) u4i0Var.f).getValue()).booleanValue();
                me2 me2Var = new me2(4, wh50Var);
                while (true) {
                    if (intValue2 == vkSegmentedControl.getTabCount()) {
                        int tabCount = vkSegmentedControl.getTabCount();
                        for (int i2 = 0; i2 < tabCount; i2++) {
                            TabLayout.g b = vkSegmentedControl.b(i2);
                            if (b != null) {
                                b.q(booleanValue ? "Seg " + vkSegmentedControl.getTabCount() : "");
                            }
                            if (b != null) {
                                TabLayout tabLayout = b.g;
                                if (tabLayout == null) {
                                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                                }
                                b.m(m33.a(R.drawable.vk_icon_ghost_20, tabLayout.getContext()));
                            }
                        }
                        vkSegmentedControl.c(vkSegmentedControl.b(intValue), true);
                        vkSegmentedControl.setOnSelectTabPosition(new zb60(me2Var, 22));
                        return s3q0.a;
                    }
                    if (intValue2 > vkSegmentedControl.getTabCount()) {
                        vkSegmentedControl.h(vkSegmentedControl.p());
                    } else {
                        TabLayout.g b2 = vkSegmentedControl.b(vkSegmentedControl.getTabCount() - 1);
                        if (b2.g != vkSegmentedControl) {
                            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
                        }
                        int i3 = b2.e;
                        ArrayList<TabLayout.g> arrayList = vkSegmentedControl.c;
                        TabLayout.g gVar = vkSegmentedControl.d;
                        int i4 = gVar != null ? gVar.e : 0;
                        TabLayout.f fVar = vkSegmentedControl.e;
                        TabLayout.i iVar = (TabLayout.i) fVar.getChildAt(i3);
                        fVar.removeViewAt(i3);
                        if (iVar != null) {
                            iVar.c();
                            vkSegmentedControl.W.a(iVar);
                        }
                        vkSegmentedControl.requestLayout();
                        TabLayout.g remove = arrayList.remove(i3);
                        if (remove != null) {
                            remove.i();
                            TabLayout.b0.a(remove);
                        }
                        int size = arrayList.size();
                        int i5 = -1;
                        for (int i6 = i3; i6 < size; i6++) {
                            if (arrayList.get(i6).e == vkSegmentedControl.b) {
                                i5 = i6;
                            }
                            arrayList.get(i6).e = i6;
                        }
                        vkSegmentedControl.b = i5;
                        if (i4 == i3) {
                            vkSegmentedControl.c(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, i3 - 1)), true);
                        }
                    }
                }
            case 1:
                StickerPackHorizontalPreviewListItemVh stickerPackHorizontalPreviewListItemVh = (StickerPackHorizontalPreviewListItemVh) this.d;
                GiftData giftData = stickerPackHorizontalPreviewListItemVh.d;
                String str = stickerPackHorizontalPreviewListItemVh.c;
                f9l0 f9l0Var = stickerPackHorizontalPreviewListItemVh.b;
                StickerPackPreview stickerPackPreview = (StickerPackPreview) this.e;
                if (this.c) {
                    View view = stickerPackHorizontalPreviewListItemVh.h;
                    f9l0Var.e((view != null ? view : null).getContext(), stickerPackPreview, str, giftData.b);
                } else if (stickerPackPreview.h && bhu.g(stickerPackPreview)) {
                    View view2 = stickerPackHorizontalPreviewListItemVh.h;
                    f9l0Var.d((view2 != null ? view2 : null).getContext(), stickerPackPreview, str);
                } else {
                    f9l0 f9l0Var2 = stickerPackHorizontalPreviewListItemVh.b;
                    View view3 = stickerPackHorizontalPreviewListItemVh.h;
                    f9l0Var2.b((view3 != null ? view3 : null).getContext(), stickerPackPreview.b, stickerPackHorizontalPreviewListItemVh.c, giftData, stickerPackHorizontalPreviewListItemVh.e, null);
                }
                return s3q0.a;
            default:
                tmq0 tmq0Var = (tmq0) this.d;
                fq3 fq3Var = (fq3) this.e;
                if (this.c) {
                    wmq0.B(tmq0Var, fq3Var, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    wmq0.B(tmq0Var, fq3Var, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ q4i0(tmq0 tmq0Var, fq3 fq3Var, boolean z) {
        this.d = tmq0Var;
        this.e = fq3Var;
        this.c = z;
    }

    public /* synthetic */ q4i0(boolean z, StickerPackHorizontalPreviewListItemVh stickerPackHorizontalPreviewListItemVh, StickerPackPreview stickerPackPreview) {
        this.c = z;
        this.d = stickerPackHorizontalPreviewListItemVh;
        this.e = stickerPackPreview;
    }
}
