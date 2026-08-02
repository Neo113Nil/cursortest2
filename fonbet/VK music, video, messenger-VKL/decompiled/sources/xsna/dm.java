package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.im.chat.restriction.impl.domain.WriteRestrictionAction;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayerMode;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.cwb0;
import xsna.o2y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dm(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.e5z, xsna.fm] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WriteRestrictionAction writeRestrictionAction;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                f5z f5zVar = (f5z) obj3;
                final izs izsVar = (izs) obj4;
                ?? r1 = new androidx.lifecycle.l() { // from class: xsna.fm
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                        izs.this.invoke(event);
                    }
                };
                f5zVar.getLifecycle().addObserver(r1);
                return new gm((gzs) obj2, f5zVar, r1);
            case 1:
                Integer num = (Integer) obj3;
                Integer num2 = (Integer) obj2;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, ((Integer) obj4).intValue(), num.intValue() + bVar.j, 0, num.intValue() + bVar.l, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, num2 != null ? num2.intValue() : bVar.b0, -1409, 1048063);
            case 2:
                ymn0 ymn0Var = (ymn0) obj3;
                wzs wzsVar = (wzs) obj2;
                q9x q9xVar = (q9x) obj;
                Map c = ymn0Var.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : (Set) obj4) {
                    Float f = (Float) wzsVar.invoke(obj5, q9xVar);
                    if (f != null) {
                        linkedHashMap.put(obj5, f);
                    }
                }
                if (!epx.f(c, linkedHashMap)) {
                    ymn0Var.f.getValue();
                    boolean isEmpty = ymn0Var.c().isEmpty();
                    ((zak0) ymn0Var.n).setValue(linkedHashMap);
                    if (isEmpty) {
                        Float f2 = (Float) ymn0Var.c().get(((zak0) ymn0Var.e).getValue());
                        if (f2 != null) {
                            ((zak0) ymn0Var.g).setValue(f2);
                        }
                    }
                }
                return s3q0.a;
            case 3:
                Context context = (Context) obj3;
                wzs wzsVar2 = (wzs) obj4;
                VideoFile videoFile = (VideoFile) obj2;
                Throwable th = (Throwable) obj;
                w1s0 w1s0Var = w1s0.b;
                if (th != null) {
                    j03.j(context, th);
                }
                wzsVar2.invoke(videoFile, th);
                return s3q0.a;
            case 4:
                w5v0 w5v0Var = (w5v0) obj3;
                hb50 hb50Var = (hb50) obj4;
                ContextWrapper contextWrapper = (ContextWrapper) obj2;
                ikv0 ikv0Var = (ikv0) obj;
                u750 u750Var = w5v0Var.e;
                bpn0 bpn0Var = w5v0Var.d;
                u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_UNHATE_CANCEL, PlayerMode.AUDIO);
                boolean z = hb50Var.c;
                MusicTrack musicTrack = hb50Var.a;
                if (z) {
                    ((a630) bpn0Var.getValue()).l0(Collections.singletonList(String.valueOf(musicTrack.b)), musicTrack, MusicPlaybackLaunchContext.d, new dsp0(4, w5v0Var, contextWrapper));
                } else {
                    itg0.m(((a630) bpn0Var.getValue()).p1(musicTrack, false, true));
                }
                ikv0Var.a();
                return s3q0.a;
            default:
                izs izsVar2 = (izs) obj4;
                brj0 brj0Var = (brj0) obj3;
                x2y0 x2y0Var = (x2y0) obj2;
                if (izsVar2 != null) {
                    izsVar2.invoke(brj0Var);
                }
                o2y0 o2y0Var = x2y0Var.f;
                if (o2y0Var != null && (writeRestrictionAction = o2y0Var.f) != null) {
                    int i2 = o2y0.a.$EnumSwitchMapping$0[writeRestrictionAction.ordinal()];
                    if (i2 == 1) {
                        o2y0Var.e.b(new cwb0.i(0), new ukv0(o2y0Var, 8), null);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        myc0.h(o2y0Var.g, null, null, new r2y0(o2y0Var, null), 3);
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ dm(izs izsVar, brj0 brj0Var, x2y0 x2y0Var) {
        this.b = 5;
        this.d = izsVar;
        this.c = brj0Var;
        this.e = x2y0Var;
    }
}
