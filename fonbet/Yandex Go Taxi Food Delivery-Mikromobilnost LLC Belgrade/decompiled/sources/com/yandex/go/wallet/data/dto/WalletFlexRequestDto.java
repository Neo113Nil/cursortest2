package com.yandex.go.wallet.data.dto;

import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/wallet/data/dto/WalletFlexRequestDto;", "", "Companion", "Accessibility", "$serializer", "com/yandex/go/wallet/data/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WalletFlexRequestDto {
    public static final b Companion = new b();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(20)), null, null};
    public final List a;
    public final String b;
    public final Accessibility c;

    public /* synthetic */ WalletFlexRequestDto(int i, List list, String str, Accessibility accessibility) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = new Accessibility(false);
        } else {
            this.c = accessibility;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/wallet/data/dto/WalletFlexRequestDto$Accessibility;", "", "Companion", "$serializer", "com/yandex/go/wallet/data/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Accessibility {
        public static final a Companion = new a();
        public final boolean a;

        public /* synthetic */ Accessibility(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public Accessibility(boolean z) {
            this.a = z;
        }

        public Accessibility() {
            this(false);
        }
    }

    public WalletFlexRequestDto(List list, String str, Accessibility accessibility) {
        this.a = list;
        this.b = str;
        this.c = accessibility;
    }

    public WalletFlexRequestDto() {
        this(null, null, new Accessibility(false));
    }
}
