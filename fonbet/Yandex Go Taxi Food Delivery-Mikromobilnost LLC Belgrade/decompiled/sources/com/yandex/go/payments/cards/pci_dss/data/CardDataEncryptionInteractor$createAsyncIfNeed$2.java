package com.yandex.go.payments.cards.pci_dss.data;

import android.content.Context;
import android.util.Base64;
import com.yandex.go.payments.cards.pci_dss.data.model.PciDssCardData;
import defpackage.bg1;
import defpackage.dw5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rc8;
import defpackage.tse;
import defpackage.tx90;
import defpackage.uza;
import defpackage.wls;
import defpackage.xnt;
import defpackage.yrt;
import defpackage.zrt;
import defpackage.zwh0;
import defpackage.zy11;
import java.io.DataInputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldw5;", "<anonymous>", "(Ltse;)Ldw5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.pci_dss.data.CardDataEncryptionInteractor$createAsyncIfNeed$2", f = "CardDataEncryptionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CardDataEncryptionInteractor$createAsyncIfNeed$2 extends SuspendLambda implements wls {
    final /* synthetic */ PciDssCardData $pciDssCardData;
    final /* synthetic */ tx90 $profile;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDataEncryptionInteractor$createAsyncIfNeed$2(a aVar, PciDssCardData pciDssCardData, tx90 tx90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pciDssCardData = pciDssCardData;
        this.$profile = tx90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDataEncryptionInteractor$createAsyncIfNeed$2(this.this$0, this.$pciDssCardData, this.$profile, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDataEncryptionInteractor$createAsyncIfNeed$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PublicKey publicKey;
        InputStream openRawResource;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        PciDssCardData pciDssCardData = this.$pciDssCardData;
        tx90 tx90Var = this.$profile;
        rc8 rc8Var = (rc8) aVar.d.getValue();
        String e = ((xnt) aVar.a).e(pciDssCardData, PciDssCardData.Companion.serializer());
        rc8Var.getClass();
        Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPwithSHA-512andMGF1Padding");
        synchronized (rc8Var) {
            publicKey = rc8Var.b;
            tx90 tx90Var2 = rc8Var.c;
            if (publicKey == null || tx90Var2 == null || tx90Var2.a != tx90Var.a) {
                zrt zrtVar = rc8Var.a;
                UserCardProfileName userCardProfileName = tx90Var.a;
                Context context = zrtVar.a;
                int i = yrt.a[userCardProfileName.ordinal()];
                if (i == 1 || i == 2) {
                    openRawResource = context.getResources().openRawResource(zwh0.billing_public_key);
                } else {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    openRawResource = context.getResources().openRawResource(zwh0.billing_public_key);
                }
                try {
                    DataInputStream dataInputStream = new DataInputStream(openRawResource);
                    try {
                        byte[] bArr = new byte[openRawResource.available()];
                        dataInputStream.readFully(bArr);
                        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
                        rc8Var.b = generatePublic;
                        rc8Var.c = tx90Var;
                        dataInputStream.close();
                        openRawResource.close();
                        publicKey = generatePublic;
                    } finally {
                    }
                } finally {
                }
            }
        }
        cipher.init(1, publicKey);
        return new dw5(new bg1(Base64.encodeToString(cipher.doFinal(e.getBytes(uza.a)), 2), 8), this.$profile);
    }
}
