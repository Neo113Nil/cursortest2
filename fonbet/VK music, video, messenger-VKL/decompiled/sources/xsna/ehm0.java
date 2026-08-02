package xsna;

import android.graphics.drawable.Drawable;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetRecomThemesResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.stories.design.view.editor.StoryStylePickerView;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.ui.call_by_link.feature.c;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.qn60;
import xsna.taw0;
import xsna.to90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ehm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ehm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.vk.catalog2.common.ui.holders.header.TopBarVh$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v67, types: [xsna.vfz, xsna.ycx0$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Set<Integer> set;
        int i = 6;
        boolean z = false;
        int i2 = 1;
        switch (this.b) {
            case 0:
                com.vk.stories.design.view.stats.tabs.stickers.mvi.c cVar = (com.vk.stories.design.view.stats.tabs.stickers.mvi.c) this.c;
                StoryEntry storyEntry = (StoryEntry) obj;
                com.vk.lists.c cVar2 = cVar.i;
                ghm0 ghm0Var = cVar.h;
                int i3 = ghm0Var.h;
                int i4 = storyEntry.c;
                if (i3 != i4) {
                    ghm0Var.g = storyEntry.d;
                    ghm0Var.h = i4;
                    cVar2.o();
                    cVar2.p(false);
                }
                break;
            case 1:
                StoryStylePickerView storyStylePickerView = (StoryStylePickerView) this.c;
                int i5 = StoryStylePickerView.c;
                int i6 = com.vk.core.view.components.tabs.d.G;
                nxv0 a = d.a.a(storyStylePickerView.getContext());
                Drawable drawable = ((TabLayout.g) obj).b;
                if (drawable != null) {
                    com.vk.core.view.components.tabs.d.U4(a, drawable, false, 6);
                }
                a.setIconUnselectedColorAttr(R.attr.vk_ui_icon_contrast);
                break;
            case 2:
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) this.c;
                ThemeChooserState a2 = ThemeChooserState.a((ThemeChooserState) obj, ThemeChooserState.ListKind.BACKGROUND, null, null, null, false, null, null, null, 254);
                bVar.o.a(a2);
                break;
            case 3:
                izs izsVar = (izs) this.c;
                List list = (List) obj;
                if (list.size() == 2 && ((Number) izsVar.invoke(((kyo0) list.get(1)).b)).floatValue() * ((Number) izsVar.invoke(((kyo0) list.get(0)).b)).floatValue() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z = true;
                }
                break;
            case 4:
                String str = (String) obj;
                ?? r0 = ((ToolbarRedesignVh) this.c).n;
                if (r0 != 0) {
                    r0.setSearchQuery(str);
                }
                break;
            case 5:
                WallWithCounters wallWithCounters = (WallWithCounters) this.c;
                qn60.c cVar3 = (qn60.c) obj;
                break;
            case 6:
                azq0 azq0Var = ((zyq0) this.c).b;
                List<Integer> d = ((RecomSettingsGetRecomThemesResponseDto) obj).d();
                if (d == null || (set = j5g.S0(d)) == null) {
                    set = EmptySet.b;
                }
                azq0Var.a.a(set);
                break;
            case 7:
                ((kfr0) this.c).c.m(JsApiMethodType.GET_FRIENDS, VkAppsErrors.Client.UNKNOWN_ERROR, null, null);
                break;
            case 8:
                ((ppr0) this.c).l.P4((iz8) obj);
                break;
            case 9:
                ((e7s0) this.c).b.l.d((List) obj);
                break;
            case 10:
                ((iyd0) this.c).invoke((Throwable) obj);
                break;
            case 11:
                ((VideoView) this.c).d.a((com.vk.fullscreenvideo.a) obj);
                break;
            case 12:
                Integer num = (Integer) obj;
                l7s0 l7s0Var = ((grt0) this.c).h;
                if (l7s0Var != null) {
                    l7s0Var.a(num.intValue() / 100.0f);
                }
                break;
            case 13:
                ggu0 ggu0Var = (ggu0) this.c;
                break;
            case 14:
                ((l5v0) this.c).o = true;
                cew cewVar = cew.b;
                long currentTimeMillis = System.currentTimeMillis();
                cewVar.getClass();
                cew.h().edit().putLong("can_write_revalidation_last_time_ms", currentTimeMillis).apply();
                break;
            case 15:
                ((qaw0) this.c).T((taw0.a) obj);
                break;
            case 16:
                lcw0 lcw0Var = (lcw0) this.c;
                lcw0Var.getClass();
                lcw0Var.d(new q60(lcw0Var, 13));
                break;
            case 17:
                ((com.vk.voip.ui.call_by_link.feature.b) this.c).T(new c.e.a((Throwable) obj));
                break;
            case 18:
                ((puw0) this.c).C(to90.h.b);
                break;
            default:
                ycx0 ycx0Var = (ycx0) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    ycx0Var.h(ycx0Var.b.c(), ycx0Var.f.getPlayerView());
                }
                break;
        }
        return s3q0.a;
    }
}
