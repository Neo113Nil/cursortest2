package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableReaction;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stickers.settings.StickerSettingsCheckItem;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.kxb0;
import xsna.l5n;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dd4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        List<ClickableSticker> list;
        switch (this.b) {
            case 0:
                kd4 kd4Var = (kd4) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1673745060, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.Content.<anonymous> (AudioBookBigPlayerControls.kt:41)");
                    }
                    kd4Var.f(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ytf0 ytf0Var = (ytf0) this.c;
                ((Integer) obj).getClass();
                if (obj2 instanceof ypi) {
                    ypi ypiVar = (ypi) obj2;
                    qh50<ypi> qh50Var = ytf0Var.h;
                    if (qh50Var == null) {
                        qh50Var = k5h0.a();
                        ytf0Var.h = qh50Var;
                    }
                    qh50Var.k(ypiVar);
                    ytf0Var.f.b(ypiVar);
                }
                if (obj2 instanceof iuf0) {
                    ytf0Var.e((iuf0) obj2);
                }
                if (obj2 instanceof androidx.compose.runtime.f) {
                    ((androidx.compose.runtime.f) obj2).d();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((njl) this.c).a(q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 3:
                a5n a5nVar = (a5n) this.c;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a = ruiVar.a(new e4n(a5nVar, a5nVar.r, a5nVar.e, nn50Var));
                es60 es60Var = a5nVar.s;
                z3n z3nVar = a5nVar.a;
                final f64 a2 = ruiVar.a(new x5o0(es60Var, z3nVar, nn50Var));
                final f64 a3 = ruiVar.a(new w5o0(es60Var, z3nVar, nn50Var));
                final f64 a4 = ruiVar.a(new z5o0(es60Var, z3nVar, nn50Var));
                final f64 a5 = ruiVar.a(new y5o0(es60Var, z3nVar, nn50Var));
                final f64 a6 = ruiVar.a(new k3n(es60Var, z3nVar, nn50Var));
                final f64 a7 = ruiVar.a(new b6o0(es60Var, z3nVar, nn50Var));
                final f64 a8 = ruiVar.a(new a6o0(es60Var, z3nVar, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.w4n
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        qk50 qk50Var = (qk50) obj3;
                        l5n l5nVar = (l5n) obj4;
                        if (l5nVar instanceof n5n) {
                            return qk50Var.a(f64.this, l5nVar);
                        }
                        if (l5nVar instanceof m5n) {
                            return qk50Var.a(a3, l5nVar);
                        }
                        if (l5nVar instanceof p5n) {
                            return qk50Var.a(a4, l5nVar);
                        }
                        if (l5nVar instanceof o5n) {
                            return qk50Var.a(a5, l5nVar);
                        }
                        if (l5nVar instanceof q5n) {
                            return qk50Var.a(a7, l5nVar);
                        }
                        if (l5nVar instanceof l5n.b) {
                            return qk50Var.a(a, l5nVar);
                        }
                        if (l5nVar instanceof l5n.a) {
                            return qk50Var.a(a6, l5nVar);
                        }
                        if (l5nVar instanceof t5n) {
                            return qk50Var.a(a8, l5nVar);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((h5x) this.c).C(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                break;
            case 6:
                gzs gzsVar = (gzs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(179236422, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.LoadingContentSurface.<anonymous> (NotificationListView.kt:265)");
                    }
                    q630 E = ahn.E(xp2.a(q630.a.a, null, 3), "NotificationsAppBar");
                    String N = d370.N(R.string.not_notifications, 0, aVar2);
                    x6p0 A = m200.A(aVar2);
                    Object x = aVar2.x();
                    Object obj3 = a.C0011a.a;
                    if (x == obj3) {
                        x = new aq0(10);
                        aVar2.R(x);
                    }
                    gzs gzsVar2 = (gzs) x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1464666478, 384, -1, "com.vk.core.compose.component.topbar.TopAppBarScrollBehavior.Companion.pinned (TopAppBarScrollBehavior.kt:82)");
                    }
                    boolean J = aVar2.J(A) | aVar2.J(gzsVar2);
                    Object x2 = aVar2.x();
                    if (J || x2 == obj3) {
                        x2 = new toa0(A, gzsVar2);
                        aVar2.R(x2);
                    }
                    toa0 toa0Var = (toa0) x2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x3 = aVar2.x();
                    if (x3 == obj3) {
                        x3 = new jb(27);
                        aVar2.R(x3);
                    }
                    ra70.b(N, gzsVar, (gzs) x3, toa0Var, E, null, aVar2, 384, 32);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 7:
                fgb0 fgb0Var = (fgb0) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(185077538, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.Content.<anonymous> (PodcastBigPlayerControls.kt:40)");
                    }
                    fgb0Var.b(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 8:
                kn20 kn20Var = ((sxb0) this.c).c;
                StickerSettingsCheckItem.Setting setting = (StickerSettingsCheckItem.Setting) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (setting == StickerSettingsCheckItem.Setting.POPUP_ANIMATIONS_ON_SEND) {
                    kn20Var.invoke(new kxb0.d(booleanValue));
                } else if (setting == StickerSettingsCheckItem.Setting.POPUP_ANIMATIONS_ON_GET) {
                    kn20Var.invoke(new kxb0.c(booleanValue));
                }
                break;
            case 9:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-320848823, intValue4, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.PublishComposeComponent.Theme.<anonymous> (PublishComposeComponent.kt:45)");
                    }
                    if (cq.i(0, aVar4, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 10:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1508378008, intValue5, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Loaded.<anonymous>.<anonymous> (Screen.kt:130)");
                    }
                    ich0.k(izsVar, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            default:
                ebm0 ebm0Var = (ebm0) this.c;
                ?? r1 = ebm0Var.o;
                y0f0 y0f0Var = (y0f0) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                StoryReactionViewGroup storyReactionViewGroup = ebm0Var.h;
                nzl0 nzl0Var = ebm0Var.b;
                StoryEntry storyEntry = ebm0Var.e;
                storyReactionViewGroup.performHapticFeedback(0);
                boolean z = true;
                boolean z2 = y0f0Var == null;
                y0f0 y0f0Var2 = (y0f0) j5g.a0(ebm0Var.k);
                y0f0 y0f0Var3 = z2 ? y0f0Var2 : null;
                MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = z2 ? MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_LIKE : MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_UNLIKE;
                String str = "like";
                if (!z2 && (booleanValue2 || y0f0Var2 == null || y0f0Var.a != y0f0Var2.a)) {
                    str = y0f0Var.e;
                }
                ClickableStickers clickableStickers = storyEntry.X;
                if (clickableStickers != null && (list = clickableStickers.d) != null) {
                    List<ClickableSticker> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (((ClickableSticker) it.next()) instanceof ClickableReaction) {
                                if (!z2) {
                                    StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
                                    storiesFeatures.getClass();
                                    if (com.vk.toggle.b.A.a(storiesFeatures) && z) {
                                        str = str.concat("_sticker");
                                    }
                                }
                                storyReactionViewGroup.g(y0f0Var3, ((Boolean) r1.getValue()).booleanValue(), ((Boolean) r1.getValue()).booleanValue());
                                ebm0Var.i.b(nzl0Var.i(storyEntry, z2, 0).subscribe());
                                ((anm0) ebm0Var.g.getValue()).q(eventType, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, ebm0Var.f, storyEntry, nzl0Var.p(), new ku1(27, str, ebm0Var));
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (!z2) {
                }
                storyReactionViewGroup.g(y0f0Var3, ((Boolean) r1.getValue()).booleanValue(), ((Boolean) r1.getValue()).booleanValue());
                ebm0Var.i.b(nzl0Var.i(storyEntry, z2, 0).subscribe());
                ((anm0) ebm0Var.g.getValue()).q(eventType, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, ebm0Var.f, storyEntry, nzl0Var.p(), new ku1(27, str, ebm0Var));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dd4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
