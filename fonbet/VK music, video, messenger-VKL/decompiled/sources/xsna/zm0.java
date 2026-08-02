package xsna;

import androidx.compose.foundation.text.HandleState;
import java.util.Collection;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class zm0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ zm0(Collection collection, Boolean bool, boolean z, AddParticipantsCommands addParticipantsCommands, izs izsVar, izs izsVar2) {
        this.d = collection;
        this.e = bool;
        this.c = z;
        this.f = addParticipantsCommands;
        this.g = izsVar;
        this.h = izsVar2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 addParticipantsExtIds$lambda$0;
        sio0 sio0Var;
        tny tnyVar;
        tny tnyVar2;
        switch (this.b) {
            case 0:
                addParticipantsExtIds$lambda$0 = AddParticipantsCommands.addParticipantsExtIds$lambda$0((Collection) this.d, (Boolean) this.e, this.c, (AddParticipantsCommands) this.f, (izs) this.g, (izs) this.h, (Signaling) obj);
                return addParticipantsExtIds$lambda$0;
            default:
                j1z j1zVar = (j1z) this.d;
                wh50 wh50Var = j1zVar.o;
                spx0 spx0Var = (spx0) this.e;
                gho0 gho0Var = (gho0) this.f;
                tho0 tho0Var = (tho0) this.g;
                uv70 uv70Var = (uv70) this.h;
                tny tnyVar3 = (tny) obj;
                j1zVar.h = tnyVar3;
                mjo0 d = j1zVar.d();
                if (d != null) {
                    d.b = tnyVar3;
                }
                if (this.c) {
                    if (j1zVar.a() == HandleState.Selection) {
                        if (((Boolean) ((zak0) j1zVar.l).getValue()).booleanValue() && spx0Var.b()) {
                            gho0Var.t();
                        } else {
                            gho0Var.q();
                        }
                        ((zak0) j1zVar.m).setValue(Boolean.valueOf(pho0.a(gho0Var, true)));
                        ((zak0) j1zVar.n).setValue(Boolean.valueOf(pho0.a(gho0Var, false)));
                        ((zak0) wh50Var).setValue(Boolean.valueOf(qko0.c(tho0Var.b)));
                    } else if (j1zVar.a() == HandleState.Cursor) {
                        ((zak0) wh50Var).setValue(Boolean.valueOf(pho0.a(gho0Var, true)));
                    }
                    kuj.f(j1zVar, tho0Var, uv70Var);
                    mjo0 d2 = j1zVar.d();
                    if (d2 != null && (sio0Var = j1zVar.e) != null && j1zVar.b() && (tnyVar = d2.b) != null && tnyVar.e() && (tnyVar2 = d2.c) != null) {
                        ljo0 ljo0Var = d2.a;
                        lk00 lk00Var = new lk00(tnyVar, 1);
                        zhf0 c = cei0.c(tnyVar);
                        zhf0 z = tnyVar.z(tnyVar2, false);
                        if (epx.f(sio0Var.a.b.get(), sio0Var)) {
                            sio0Var.b.e(tho0Var, uv70Var, ljo0Var, lk00Var, c, z);
                        }
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ zm0(j1z j1zVar, boolean z, spx0 spx0Var, gho0 gho0Var, tho0 tho0Var, uv70 uv70Var) {
        this.d = j1zVar;
        this.c = z;
        this.e = spx0Var;
        this.f = gho0Var;
        this.g = tho0Var;
        this.h = uv70Var;
    }
}
