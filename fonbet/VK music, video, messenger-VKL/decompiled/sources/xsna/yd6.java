package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSubscribersVh;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.ems;
import xsna.fhc0;
import xsna.gm50;
import xsna.jth0;
import xsna.tth0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yd6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = null;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((z7v) obj5).getClass();
                ((ae6) obj3).a.j1((HistoryAttachAction) obj, (HistoryAttach) obj4);
                break;
            case 1:
                r2o r2oVar = (r2o) obj4;
                emc0 emc0Var = (emc0) obj3;
                int intValue = ((Integer) obj).intValue();
                Iterator<T> it = ((DonutSettingsDialogConfig) obj5).c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((DonutPostingSettings.Duration) next).b == intValue) {
                            obj2 = next;
                        }
                    }
                }
                DonutPostingSettings.Duration duration = (DonutPostingSettings.Duration) obj2;
                if (duration != null) {
                    dmc0 dmc0Var = emc0Var.a;
                    ((fhc0.e) dmc0Var.g.getValue()).g(dmc0Var.b);
                    ylc0 ylc0Var = dmc0Var.c;
                    if (ylc0Var != null) {
                        ylc0Var.b().a(duration);
                    }
                }
                dw20 dw20Var = r2oVar.k;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 2:
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj5;
                FriendsSubscribersVh friendsSubscribersVh = (FriendsSubscribersVh) obj4;
                Context context = (Context) obj3;
                uIBlockProfile.E = 1;
                friendsSubscribersVh.b.j(new ems.a(uIBlockProfile));
                if (uIBlockProfile.equals(friendsSubscribersVh.h)) {
                    VkRichCell vkRichCell = friendsSubscribersVh.g;
                    VkRichCell vkRichCell2 = vkRichCell != null ? vkRichCell : null;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    pgv0 middle = vkRichCell.getMiddle();
                    vkRichCell2.setMiddle(middle != null ? friendsSubscribersVh.e(middle, context, uIBlockProfile) : null);
                }
                break;
            case 3:
                Set<String> set = MusicTrackCellVh.A;
                ((MusicTrackCellVh) obj5).e().W(((View) obj4).getContext(), (MusicTrack) obj3, true, (List) obj);
                break;
            case 4:
                ClipsSeekBar clipsSeekBar = (ClipsSeekBar) obj5;
                wh50 wh50Var = (wh50) obj3;
                clipsSeekBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                awt0.j(iah0.a(12), clipsSeekBar);
                clipsSeekBar.setIgnoreMovementThreshold(0);
                clipsSeekBar.setSelectedColor(R.color.vk_white);
                clipsSeekBar.setThumbColor(R.color.vk_white);
                clipsSeekBar.setOnSeekBarChangeListener(new zah0((izs) obj4, wh50Var));
                clipsSeekBar.setStateListener(new ebh0(wh50Var));
                break;
            case 5:
                jth0 jth0Var = (jth0) obj5;
                gm50.a.a(jth0Var, ((tth0.a) obj).a, new apg(jth0Var, (fth0) obj4, (jth0.b) obj3, 4));
                break;
            default:
                hkw0 hkw0Var = (hkw0) obj5;
                Context context2 = (Context) obj4;
                hrw0 hrw0Var = (hrw0) obj3;
                ikv0 ikv0Var = hkw0Var.d;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                hkw0Var.d = null;
                ma9 ma9Var = hkw0Var.b;
                String str = hrw0Var.a;
                ((ImBridgeComponent) ((k7m) m7m.f(ma9Var.a)).a(fpf0.a(ImBridgeComponent.class))).g5().getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
                Intent createChooser = Intent.createChooser(intent, context2.getString(R.string.share));
                createChooser.addFlags(268435456);
                context2.startActivity(createChooser);
                break;
        }
        return s3q0.a;
    }
}
