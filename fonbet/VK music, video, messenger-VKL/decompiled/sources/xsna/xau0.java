package xsna;

import com.vk.api.generated.calls.dto.CallsShortCredentialsDto;
import com.vk.api.generated.messages.dto.MessagesGetJoinLinkResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.vmoji.storage.api.VmojiStorageException;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vk.voip.ui.qr.ui.a;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import com.vk.voip.ui.share.link.pager.view.b;
import com.vk.voip.ui.share.link.pager.view.c;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import xsna.bi10;
import xsna.pxw0;
import xsna.qmw0;
import xsna.tnv0;
import xsna.xuw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xau0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xau0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        byte[] bArr;
        byte[] doFinal;
        int i = this.b;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((yau0) obj2).i.setLoading(true);
                return s3q0.a;
            case 1:
                ((rzq0) obj).b(((exm0) obj2).e, tnv0.a.b);
                return s3q0.a;
            case 2:
                byte[] bArr2 = (byte[]) obj;
                String valueOf = String.valueOf(((UserId) obj2).b);
                m6o0 m6o0Var = new m6o0(valueOf);
                if (bArr2.length < 16) {
                    L.l("Invalid encrypted data for vmoji");
                } else {
                    try {
                    } catch (Throwable th) {
                        L.g("Can't process source data", th);
                    }
                    if (valueOf.toString().length() == 0) {
                        L.l("Unexpected input data");
                        bArr = null;
                        if (bArr != null) {
                            try {
                                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                                cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2, 0, 16));
                                doFinal = cipher.doFinal(bArr2, 16, bArr2.length - 16);
                            } catch (Throwable th2) {
                                L.g("Can't decode vmoji data", th2);
                            }
                            if (doFinal == null) {
                                return doFinal;
                            }
                            throw new VmojiStorageException("Can't decode vmoji file content", null);
                        }
                    } else {
                        bArr = m6o0Var.i();
                        if (bArr != null) {
                        }
                    }
                }
                doFinal = null;
                if (doFinal == null) {
                }
            case 3:
                return new VoipActionsFeatureState.h(((v79) obj2).c.g(), ((Boolean) obj).booleanValue());
            case 4:
                ((bgw0) obj2).b.a(a.AbstractC2032a.d.a);
                return s3q0.a;
            case 5:
                ((zhw0) obj2).T(miw0.b);
                return s3q0.a;
            case 6:
                qmw0.a aVar = (qmw0.a) obj;
                com.vk.voip.ui.c cVar = ((nmw0) obj2).a;
                dhw0 L = cVar.L();
                cVar.X0(L != null ? dhw0.a(L, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, aVar.a, aVar.b, false, false, false, false, null, null, Integer.MAX_VALUE, 510) : null);
                return s3q0.a;
            case 7:
                io.reactivex.rxjava3.subjects.d<Boolean> dVar = ((qrw0) obj2).t;
                List<bi10> list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (bi10 bi10Var : list) {
                        if ((bi10Var instanceof bi10.d) && ((bi10.d) bi10Var).a.m) {
                            dVar.onNext(Boolean.valueOf(z));
                            return s3q0.a;
                        }
                    }
                }
                z = false;
                dVar.onNext(Boolean.valueOf(z));
                return s3q0.a;
            case 8:
                ((puw0) obj2).T((xuw0.a) obj);
                return s3q0.a;
            case 9:
                int i2 = VoipQrCodeScannerFragment.W;
                ((VoipQrCodeScannerFragment) obj2).fo((a.C2071a) obj);
                return s3q0.a;
            case 10:
                ((qxw0) obj2).a(new pxw0.d((VoipScheduledCallDuration) obj));
                return s3q0.a;
            case 11:
                com.vk.voip.ui.share.link.pager.view.b bVar = (com.vk.voip.ui.share.link.pager.view.b) obj2;
                MessagesGetJoinLinkResponseDto messagesGetJoinLinkResponseDto = (MessagesGetJoinLinkResponseDto) obj;
                String d = messagesGetJoinLinkResponseDto.d();
                CallsShortCredentialsDto e = messagesGetJoinLinkResponseDto.e();
                bVar.g = new b.a(new c.a(d), e != null ? new c.b(e.d(), e.e()) : null);
                bVar.c();
                return s3q0.a;
            default:
                ((tux0) obj2).a.invoke();
                return s3q0.a;
        }
    }
}
