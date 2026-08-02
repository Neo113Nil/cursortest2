package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.stash.StashCell;
import com.yandex.passport.internal.ui.social.gimap.GimapTrack;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.d6w;
import defpackage.j73;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes2.dex */
public final class p implements com.yandex.passport.internal.ui.sloth.webcard.a, com.yandex.passport.sloth.command.q {
    public final Object a;
    public final Object b;

    public p(byte[] bArr) {
        this.a = new SecretKeySpec(j73.Y(bArr, new d6w(0, 15, 1)), JCSP.AES_NAME);
        this.b = new IvParameterSpec(j73.Y(bArr, new d6w(16, bArr.length - 1, 1)));
    }

    @Override // com.yandex.passport.sloth.command.q
    public Object a(Object obj, Continuation continuation) {
        return ((com.yandex.passport.sloth.command.s) this.b).a((SlothParams) this.a, obj, continuation);
    }

    public IvParameterSpec b() {
        return (IvParameterSpec) this.b;
    }

    public SecretKeySpec c() {
        return (SecretKeySpec) this.a;
    }

    public List d() {
        return (List) this.b;
    }

    public List e() {
        return (ArrayList) this.a;
    }

    public void f(ModernAccount modernAccount, GimapTrack gimapTrack) {
        com.yandex.passport.internal.ui.social.gimap.o oVar = (com.yandex.passport.internal.ui.social.gimap.o) this.a;
        g.i(oVar.B, modernAccount, new Pair[]{new Pair(StashCell.GIMAP_TRACK, gimapTrack.isFull() ? gimapTrack.toJson() : null)});
        oVar.C.m(modernAccount);
    }

    public p(com.yandex.passport.internal.ui.social.gimap.a aVar, com.yandex.passport.internal.ui.social.gimap.o oVar) {
        this.b = aVar;
        this.a = oVar;
    }

    public /* synthetic */ p(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
