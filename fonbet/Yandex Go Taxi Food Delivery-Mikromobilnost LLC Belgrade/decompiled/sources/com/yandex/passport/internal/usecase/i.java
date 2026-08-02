package com.yandex.passport.internal.usecase;

import java.util.function.Supplier;
import javax.crypto.Cipher;

/* loaded from: classes8.dex */
public final /* synthetic */ class i implements Supplier {
    public final /* synthetic */ int a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
        }
        return Cipher.getInstance("AES/GCM/NoPadding");
    }
}
