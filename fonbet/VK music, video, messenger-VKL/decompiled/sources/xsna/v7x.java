package xsna;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;

/* compiled from: InstantUploader.kt */
/* loaded from: classes2.dex */
public final class v7x implements odq0, sdp, ouf0 {
    public static final v7x d = new v7x((Object) null, 1);
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ v7x(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.odq0
    public g2z a(Attach attach, dh30 dh30Var) throws Exception {
        w2w w2wVar = (w2w) this.c;
        if (attach instanceof AttachImage) {
            return new viw(w2wVar, (AttachImage) attach).a(attach, dh30Var);
        }
        if (attach instanceof AttachDoc) {
            return new rtn(w2wVar, (AttachDoc) attach).a(attach, dh30Var);
        }
        if (attach instanceof AttachAudioMsg) {
            return new gr4(w2wVar, (AttachAudioMsg) attach).a(attach, dh30Var);
        }
        if (attach instanceof AttachGraffiti) {
            return new ddu(w2wVar, (AttachGraffiti) attach).a(attach, dh30Var);
        }
        if (attach instanceof AttachStory) {
            AttachStory attachStory = (AttachStory) attach;
            return attachStory.i != null ? new b8m0(w2wVar, attachStory).a(attach, dh30Var) : new kkm0(w2wVar, attachStory).a(attach, dh30Var);
        }
        if (attach instanceof AttachVideo) {
            return new xot0(w2wVar, (AttachVideo) attach).a(attach, dh30Var);
        }
        if (attach instanceof AttachVideoMsg) {
            return new lxs0(w2wVar, (AttachVideoMsg) attach).a(attach, dh30Var);
        }
        throw new UnsupportedOperationException("Unsupported attach: " + attach);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        switch (this.b) {
            case 7:
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzc(new xa01((TaskCompletionSource) obj2), (PublicKeyCredentialCreationOptions) this.c);
                break;
            default:
                ms01 ms01Var = (ms01) obj;
                nwz0 nwz0Var = (nwz0) ms01Var.getService();
                ApiMetadata zza = zzff.zza(ms01Var.getContext());
                y301 y301Var = ((a401) this.c).a;
                Parcel zza2 = nwz0Var.zza();
                com.google.android.gms.internal.cast.zzc.zze(zza2, y301Var);
                com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
                nwz0Var.zzd(18, zza2);
                nwz0 nwz0Var2 = (nwz0) ms01Var.getService();
                ApiMetadata zza3 = zzff.zza(ms01Var.getContext());
                Parcel zza4 = nwz0Var2.zza();
                com.google.android.gms.internal.cast.zzc.zzc(zza4, zza3);
                nwz0Var2.zzd(17, zza4);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
        }
    }

    @Override // xsna.sdp
    public void b(String str) {
        sdp sdpVar = ((kep) this.c).e;
        if (sdpVar != null) {
            sdpVar.b(str);
        }
    }

    @Override // xsna.odq0
    public boolean c(Attach attach) {
        return (attach instanceof AttachImage) || (attach instanceof AttachDoc) || (attach instanceof AttachAudioMsg) || (attach instanceof AttachGraffiti) || (attach instanceof AttachStory) || (attach instanceof AttachVideo) || (attach instanceof AttachVideoMsg);
    }

    public String toString() {
        switch (this.b) {
            case 1:
                awl awlVar = (awl) this.c;
                if (awlVar == null) {
                    return "any version";
                }
                return awlVar.toString() + " or higher";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v7x(z6r z6rVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.b = 7;
        this.c = publicKeyCredentialCreationOptions;
    }

    public v7x() {
        this.b = 6;
        this.c = new yd10();
    }
}
