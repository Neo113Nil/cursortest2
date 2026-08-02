package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.log.L;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMusicStreamMixWatchClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.uem;
import xsna.w1m0;
import xsna.wpa0;
import xsna.y8g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class qa6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qa6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.l0c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogHeaderController.c cVar;
        int i = this.b;
        int i2 = 1;
        int i3 = 3;
        int i4 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                ta6 ta6Var = (ta6) obj;
                Object obj2 = ta6Var.o;
                Object obj3 = obj2;
                if (obj2 == null) {
                    obj3 = null;
                }
                ?? r1 = (l0c) obj3;
                String str = ta6Var.u;
                r1.a0(str != null ? str : 0);
                break;
            case 1:
                Object obj4 = ((cj6) obj).o;
                ((km90) (obj4 != null ? obj4 : null)).J1();
                break;
            case 2:
                ((hjc) obj).onClick();
                break;
            case 3:
                uem.a aVar = ((vem) obj).b;
                if (aVar != null && (cVar = uem.this.i) != null) {
                    DialogHeaderController.this.r();
                    break;
                }
                break;
            case 4:
                djo djoVar = (djo) obj;
                djoVar.m(false);
                w1m0.a aVar2 = djoVar.G;
                if (aVar2.g) {
                    djoVar.t(new wpa0.a(new y8g.c(aVar2.f), false));
                    w1m0.a aVar3 = djoVar.G;
                    int i5 = aVar3.f;
                    BrushesPanel.BrushType brushType = aVar3.e;
                    BrushesPanel brushesPanel = djoVar.y;
                    if (brushesPanel != null) {
                        brushesPanel.setCurrentBrush(brushType);
                    }
                    BrushesPanel brushesPanel2 = djoVar.y;
                    if (brushesPanel2 != null) {
                        brushesPanel2.setCurrentColor(i5);
                        break;
                    }
                }
                break;
            case 5:
                q7r q7rVar = (q7r) obj;
                q50 q50Var = q7rVar.s0;
                int currentIndex = q7rVar.i0.getCurrentIndex();
                mkm0 mkm0Var = q50Var.a.i0;
                if (mkm0Var.getStoriesContainer().b != null && mkm0Var.getStoriesContainer().Bb() == null) {
                    mkm0Var.a(mkm0Var.getDependencies().p.g(mkm0Var.getStoriesContainer().Ab()).subscribe(new f50(new com.vk.movika.sdk.base.logic.interactor.e(q50Var, i3), i4), new ia(new r50(L.a, 0), i2)));
                    break;
                } else {
                    q50.i(q50Var, currentIndex, 2);
                    break;
                }
            case 6:
                ko40 ko40Var = (ko40) obj;
                Integer tn = ko40Var.tn();
                if (tn != null) {
                    int intValue = tn.intValue();
                    UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf = ko40Var.l;
                    if (uIBlockMusicMixTopshelf != null) {
                        UIBlockMusicMixTopshelf.Item item = (UIBlockMusicMixTopshelf.Item) j5g.b0(intValue, uIBlockMusicMixTopshelf.y);
                        List<VideoFile> list = item != null ? item.g : null;
                        if (list == null) {
                            list = EmptyList.b;
                        }
                        if (list.isEmpty()) {
                            yok0 yok0Var = ko40Var.s;
                            if (yok0Var != null) {
                                yok0Var.b(null);
                            }
                            ko40Var.s = myc0.h(g5z.a(ko40Var), null, null, new lo40(ko40Var, uIBlockMusicMixTopshelf, null), 3);
                        } else {
                            VideoFile videoFile = (VideoFile) j5g.b0(1, list);
                            if (videoFile != null || (videoFile = (VideoFile) j5g.a0(list)) != null) {
                                ko40Var.un(uIBlockMusicMixTopshelf, videoFile);
                            }
                        }
                    }
                }
                und0 und0Var = new und0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CATALOG_ITEM;
                UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf2 = ko40Var.l;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, null, uIBlockMusicMixTopshelf2 != null ? uIBlockMusicMixTopshelf2.b : null, null, 46, null), new CommonVideoStat$TypeVideoMusicStreamMixWatchClick(r6, r6, i3, r6), 2);
                und0Var.f = c;
                und0Var.g = b;
                und0Var.q();
                break;
            case 7:
                ss3 ss3Var = ((cqc0) obj).k;
                if (ss3Var != null) {
                    ss3Var.invoke();
                    break;
                }
                break;
            default:
                ((f5) obj).invoke();
                break;
        }
    }
}
