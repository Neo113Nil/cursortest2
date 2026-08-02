package ru.mail.libverify.api;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationApi;
import xsna.bpn0;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class k {
    private final Lazy a;
    private final Lazy b;
    private final Lazy c;

    public static final class a extends Lambda implements gzs<VerificationApi.FailReason> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // xsna.gzs
        public final VerificationApi.FailReason invoke() {
            return VerificationApi.FailReason.GENERAL_ERROR.a(this.a.getString(R.string.general_error_description));
        }
    }

    public static final class b extends Lambda implements gzs<VerificationApi.FailReason> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // xsna.gzs
        public final VerificationApi.FailReason invoke() {
            return VerificationApi.FailReason.NETWORK_ERROR.a(this.a.getString(R.string.general_error_description));
        }
    }

    public static final class c extends Lambda implements gzs<VerificationApi.FailReason> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // xsna.gzs
        public final VerificationApi.FailReason invoke() {
            return VerificationApi.FailReason.NO_NETWORK.a(this.a.getString(R.string.network_error_description));
        }
    }

    public k(Context context) {
        this.a = new bpn0(new a(context));
        this.b = new bpn0(new c(context));
        this.c = new bpn0(new b(context));
    }

    public final VerificationApi.FailReason a() {
        return (VerificationApi.FailReason) this.a.getValue();
    }

    public final VerificationApi.FailReason b() {
        return (VerificationApi.FailReason) this.c.getValue();
    }

    public final VerificationApi.FailReason c() {
        return (VerificationApi.FailReason) this.b.getValue();
    }
}
