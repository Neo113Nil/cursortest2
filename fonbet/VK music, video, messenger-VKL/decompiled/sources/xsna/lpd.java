package xsna;

import android.content.Context;
import android.database.Cursor;
import android.os.Trace;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.n0s;
import xsna.sb40;

/* compiled from: ClipsDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class lpd extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack f;
        PlayerTrack playerTrack;
        float b;
        switch (this.b) {
            case 0:
                ((vkd) this.receiver).a((MobileOfficialAppsClipsStat$TypeClipDraft) obj);
                return s3q0.a;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 2:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.receiver;
                qcy<Object>[] qcyVarArr = com.vk.im.ui.components.contacts.a.d0;
                aVar.h1((ContactsList) obj);
                return s3q0.a;
            case 3:
                View view = (View) obj;
                tcj tcjVar = (tcj) this.receiver;
                if (view instanceof qaj) {
                    qcj qcjVar = tcjVar.b;
                    qtd0 contact = ((qaj) view).getContact();
                    equ0 equ0Var = equ0.this;
                    rcj rcjVar = (rcj) equ0Var.p.getValue();
                    com.vk.core.tips.b bVar = rcjVar.c;
                    if (bVar != null) {
                        bVar.b(false);
                    }
                    rcjVar.c = null;
                    o0w b2 = equ0Var.j.b();
                    Context context = equ0Var.m;
                    o0w.x(b2, context == null ? null : context, null, contact.G3(), null, null, null, false, null, null, null, null, null, null, "contact_onboarding", null, null, null, true, null, null, null, null, null, 1071636472);
                } else {
                    int i = tcj.f;
                    tcjVar.getClass();
                }
                return s3q0.a;
            case 4:
                pdm pdmVar = (pdm) this.receiver;
                int i2 = pdm.m;
                n0s n0sVar = (n0s) pdmVar.j.getValue();
                Cursor d = n0sVar.b.b().d(n0sVar.a.b((Collection) obj, n0s.a.ID), null);
                HashMap hashMap = new HashMap(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                n0s.a aVar2 = n0s.a.ID;
                                hashMap.put(Integer.valueOf(fl3.A(d, aVar2.getKey())), new spm(fl3.A(d, aVar2.getKey()), fl3.A(d, n0s.a.UNREAD_UNMUTED.getKey()), fl3.A(d, n0s.a.UNREAD_MUTED.getKey())));
                                d.moveToNext();
                            }
                        }
                        return hashMap;
                    } finally {
                        d.close();
                    }
                } finally {
                    Trace.endSection();
                }
            case 5:
                Throwable th = (Throwable) obj;
                afm afmVar = (afm) this.receiver;
                f9w f9wVar = afm.F;
                afmVar.getClass();
                afm.F.a(th);
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.l();
                }
                dfm dfmVar2 = afmVar.z;
                if (dfmVar2 != null) {
                    dfmVar2.d(th);
                }
                return s3q0.a;
            case 6:
                com.vk.photos.ui.editalbum.domain.c.U((com.vk.photos.ui.editalbum.domain.c) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 7:
                yj40 yj40Var = (yj40) obj;
                qb40 qb40Var = (qb40) this.receiver;
                u750 u750Var = qb40Var.f;
                tb40 tb40Var = qb40Var.d;
                com.vk.music.player.f fVar = tb40Var.b.a;
                if (fVar != null && (f = fVar.f()) != null) {
                    int i3 = f.V;
                    if (yj40Var instanceof fa50) {
                        if (epx.f(((fa50) yj40Var).a, f)) {
                            qb40Var.b(new sb40.g(false, qb40Var.c, true));
                        }
                    } else if (yj40Var instanceof yd50) {
                        if (((yd50) yj40Var).c.equals(f)) {
                            qb40Var.b(new sb40.g(true, false, false));
                        }
                    } else if (yj40Var instanceof ib50) {
                        ib50 ib50Var = (ib50) yj40Var;
                        MusicTrack musicTrack = ib50Var.b;
                        MusicTrack musicTrack2 = ib50Var.a;
                        if (epx.f(musicTrack, f)) {
                            com.vk.music.player.f fVar2 = tb40Var.b.a;
                            playerTrack = fVar2 != null ? fVar2.c : null;
                            if (playerTrack != null) {
                                playerTrack.b = MusicTrack.zb(playerTrack.b, 0, null, 0, 0, null, false, null, musicTrack2.J, false, false, null, null, null, -1, 1048571);
                            }
                            qb40Var.b(new sb40.f(musicTrack2.J));
                        }
                    } else if (yj40Var instanceof gc50) {
                        MusicTrack musicTrack3 = (MusicTrack) ((gc50) yj40Var).a.get(f.Fb());
                        if (musicTrack3 != null) {
                            com.vk.music.player.f fVar3 = tb40Var.b.a;
                            playerTrack = fVar3 != null ? fVar3.c : null;
                            if (playerTrack != null) {
                                playerTrack.b = MusicTrack.zb(playerTrack.b, 0, null, 0, 0, null, false, null, musicTrack3.J, false, false, null, null, null, -1, 1048571);
                            }
                            qb40Var.b(new sb40.f(musicTrack3.J));
                        }
                    } else if (yj40Var instanceof hb50) {
                        u2b0 u2b0Var = qb40Var.a;
                        if (epx.f(((hb50) yj40Var).b, f)) {
                            u750Var.U(qb40Var.a(f));
                            f.P = true;
                            qb40Var.b(new sb40.c(true));
                            vvr0.d();
                            cvk.u(jnj.d(i3) ? R.string.music_kids_track_disliked : R.string.music_track_disliked, false);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("action", "dislike");
                            u2b0Var.setPayload(jSONObject.toString());
                            u2b0Var.s0(new PlaybackActionMeta(7, 0L, 2, null));
                            u2b0Var.setPayload(null);
                        }
                    } else if (yj40Var instanceof gb50) {
                        gb50 gb50Var = (gb50) yj40Var;
                        MusicTrack musicTrack4 = gb50Var.b;
                        boolean z = gb50Var.c;
                        if (epx.f(musicTrack4, f)) {
                            u750Var.L(qb40Var.a(f), z);
                            f.P = false;
                            qb40Var.b(new sb40.c(false));
                            if (!z) {
                                cvk.u(jnj.d(i3) ? R.string.music_kids_track_dislike_removed : R.string.music_track_dislike_removed, false);
                            }
                            vvr0.d();
                        }
                    } else if (yj40Var instanceof ave0) {
                        ave0 ave0Var = (ave0) yj40Var;
                        if (f.Wb() && f.b == ave0Var.a) {
                            com.vk.music.player.f fVar4 = tb40Var.b.a;
                            playerTrack = fVar4 != null ? fVar4.c : null;
                            if (playerTrack != null) {
                                playerTrack.b = MusicTrack.zb(playerTrack.b, 0, o25.a().c(), 0, 0, null, false, null, null, false, false, null, null, null, -3, 1048575);
                            }
                            qb40Var.b(new sb40.g(false, false, true));
                        }
                    } else if (yj40Var instanceof bve0) {
                        bve0 bve0Var = (bve0) yj40Var;
                        if (f.Wb() && f.b == bve0Var.a) {
                            com.vk.music.player.f fVar5 = tb40Var.b.a;
                            playerTrack = fVar5 != null ? fVar5.c : null;
                            if (playerTrack != null) {
                                playerTrack.b = MusicTrack.zb(playerTrack.b, 0, UserId.d, 0, 0, null, false, null, null, false, false, null, null, null, -3, 1048575);
                            }
                            qb40Var.b(new sb40.g(true, false, false));
                        }
                    }
                }
                return s3q0.a;
            case 8:
                e5d0 e5d0Var = (e5d0) this.receiver;
                e5d0Var.getClass();
                zk70.e((Throwable) obj);
                e5d0Var.m.close();
                return s3q0.a;
            case 9:
                float floatValue = ((Number) obj).floatValue();
                zfe0 zfe0Var = (zfe0) this.receiver;
                kg50 kg50Var = zfe0Var.f;
                boolean c = zfe0Var.c();
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!c) {
                    vak0 vak0Var = (vak0) kg50Var;
                    float floatValue2 = vak0Var.getFloatValue() + floatValue;
                    if (floatValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        floatValue2 = 0.0f;
                    }
                    float floatValue3 = floatValue2 - vak0Var.getFloatValue();
                    ((vak0) zfe0Var.f).g(floatValue2);
                    if (zfe0Var.a() <= zfe0Var.b()) {
                        b = zfe0Var.a();
                    } else {
                        float abs = Math.abs(zfe0Var.a() / zfe0Var.b()) - 1.0f;
                        if (abs >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f2 = abs;
                        }
                        if (f2 > 2.0f) {
                            f2 = 2.0f;
                        }
                        b = (zfe0Var.b() * (f2 - (((float) Math.pow(f2, 2)) / 4))) + zfe0Var.b();
                    }
                    ((vak0) zfe0Var.e).g(b);
                    f2 = floatValue3;
                }
                return Float.valueOf(f2);
            case 10:
                ((qql0) this.receiver).getClass();
                return s3q0.a;
            default:
                qvw0 qvw0Var = (qvw0) obj;
                mjw0 mjw0Var = (mjw0) this.receiver;
                gzs<s3q0> gzsVar = mjw0Var.c1;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                mjw0Var.S0.a(new wr80(mjw0Var.getContext(), qvw0Var));
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpd(Object obj, int i) {
        super(1, obj, afm.class, "onClearDialogError", "onClearDialogError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(1, obj, qb40.class, "resolveMusicEvent", "resolveMusicEvent(Lcom/vk/music/events/MusicEvent;)V", 0);
                break;
            case 10:
                super(1, obj, qql0.class, "bindStoriesResponse", "bindStoriesResponse(Lcom/vk/dto/stories/model/GetStoriesResponse;)V", 0);
                break;
            default:
                break;
        }
    }
}
