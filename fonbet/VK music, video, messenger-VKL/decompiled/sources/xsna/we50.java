package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.mixsettings.MixCategoryEntity;
import com.vk.music.mixsettings.MixCategoryType;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.e;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.random.Random;
import xsna.k840;
import xsna.ue50;
import xsna.xe50;
import xsna.ye50;

/* compiled from: MusicVkMixSettingsFeature.kt */
/* loaded from: classes3.dex */
public final class we50 extends wk50<df50, cf50, ue50, ye50> {
    public final u2b0 f;
    public final q4v0 g;
    public final f4z h;
    public MixData i;
    public final a j;

    /* compiled from: MusicVkMixSettingsFeature.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final boolean t3(VkPlayerException vkPlayerException) {
            we50 we50Var = we50.this;
            we50Var.h.b(xe50.b.a);
            we50Var.f.n0(this);
            return true;
        }
    }

    public we50(ze50 ze50Var, ue50.c cVar, u2b0 u2b0Var, q4v0 q4v0Var) {
        super(cVar, ze50Var);
        this.f = u2b0Var;
        this.g = q4v0Var;
        this.h = new f4z();
        this.i = new MixData("", "", "", "", false, null);
        this.j = new a();
    }

    @Override // xsna.wk50
    public final void N(cf50 cf50Var, ue50 ue50Var) {
        Long l;
        MixSettingsEntity mixSettingsEntity;
        ue50 ue50Var2 = ue50Var;
        boolean z = ue50Var2 instanceof ue50.b;
        f4z f4zVar = this.h;
        if (z) {
            f4zVar.b(xe50.a.a);
            return;
        }
        if (ue50Var2 instanceof ue50.c) {
            MixData mixData = ((ue50.c) ue50Var2).b;
            this.i = mixData;
            MixSettings mixSettings = mixData.g;
            if (mixSettings == null) {
                U();
                return;
            } else {
                T(new ye50.b(mixSettings));
                return;
            }
        }
        if (!(ue50Var2 instanceof ue50.a)) {
            if (!ue50Var2.equals(ue50.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            U();
            return;
        }
        MixSettings mixSettings2 = ((ue50.a) ue50Var2).b;
        String str = mixSettings2.b;
        String str2 = mixSettings2.c;
        boolean z2 = mixSettings2.d;
        List<MixCategory> list = mixSettings2.e;
        int i = 10;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MixCategory mixCategory = (MixCategory) it.next();
            String str3 = mixCategory.b;
            String str4 = mixCategory.c;
            MixCategoryType mixCategoryType = mixCategory.d;
            List<MixOption> list2 = mixCategory.e;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, i));
            for (MixOption mixOption : list2) {
                arrayList2.add(new MixOptionEntity(mixOption.b, mixOption.c, mixOption.d, mixOption.e, mixOption.f));
                it = it;
            }
            arrayList.add(new MixCategoryEntity(str3, str4, mixCategoryType, arrayList2));
            it = it;
            i = 10;
        }
        MixSettingsEntity mixSettingsEntity2 = new MixSettingsEntity(str, str2, z2, arrayList);
        com.vk.core.utils.newtork.b.a.getClass();
        boolean d = com.vk.core.utils.newtork.b.d();
        a aVar = this.j;
        if (d) {
            MixData mixData2 = this.i;
            mixData2.getClass();
            if (!mixData2.equals(new MixData("", "", "", "", false, null))) {
                u2b0 u2b0Var = this.f;
                StartPlaySource j = u2b0Var.j();
                StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
                boolean f = epx.f(mixSettingsEntity2.e, (startPlayVkMixSource == null || (mixSettingsEntity = startPlayVkMixSource.h) == null) ? null : mixSettingsEntity.e);
                if (f) {
                    l = null;
                } else {
                    Random.b.getClass();
                    l = Long.valueOf(Random.c.n(9999999999999L));
                }
                if (!f) {
                    s750 s750Var = k840.a.e;
                    if (s750Var == null) {
                        s750Var = null;
                    }
                    s750Var.G0(this.i.b, l, mixSettingsEntity2);
                }
                MixOptionEntity e = mixSettingsEntity2.e();
                String str5 = e != null ? e.c : null;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = str5;
                u2b0Var.P0(aVar, false);
                MixData mixData3 = this.i;
                u2b0Var.N0(new lqk0(new StartPlayVkMixSource(mixData3.c, mixData3.d, mixData3.b, mixData3.f, str6, mixSettingsEntity2, null, null, null, l, 448, null), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.M.Bb(this.i.c), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
                f4zVar.b(xe50.a.a);
            }
        } else {
            aVar.t3(null);
        }
        f4zVar.b(xe50.a.a);
    }

    public final void U() {
        String str = this.i.b;
        if (str.length() == 0) {
            str = null;
        }
        if (str != null) {
            this.e.b(new io.reactivex.rxjava3.internal.operators.single.n(this.g.a(str, null).q(io.reactivex.rxjava3.schedulers.a.b()).m(yiz.f(com.vk.mvi.core.internal.executors.a.a)), new zk30(new xgv(this, 16), 5)).subscribe(new pdw(new jjx(this, 17), 9), new k2y(new w910(this, 6), 8)));
        }
    }
}
