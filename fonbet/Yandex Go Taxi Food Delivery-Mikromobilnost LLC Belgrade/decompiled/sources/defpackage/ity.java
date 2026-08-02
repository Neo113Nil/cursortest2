package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.common.a;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.x0;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class ity implements mle0, nf00, jh20, lqd0, oyy, rhp0, o2v0, rf31, tu81 {
    public static ity a;

    public /* synthetic */ ity() {
    }

    @Override // defpackage.tu81
    public tr81 a(Context context) {
        return new s400(new omy0());
    }

    @Override // defpackage.jh20
    public k2x b(gr80 gr80Var) {
        return null;
    }

    @Override // defpackage.mle0
    public CharSequence c(Preference preference) {
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        ListPreference listPreference = (ListPreference) preference;
        int A = listPreference.A(listPreference.q0);
        if (TextUtils.isEmpty((A < 0 || (charSequenceArr2 = listPreference.o0) == null) ? null : charSequenceArr2[A])) {
            return listPreference.a.getString(j0i0.not_set);
        }
        int A2 = listPreference.A(listPreference.q0);
        if (A2 < 0 || (charSequenceArr = listPreference.o0) == null) {
            return null;
        }
        return charSequenceArr[A2];
    }

    @Override // defpackage.oyy
    public /* bridge */ /* synthetic */ void d(pyy pyyVar, long j, long j2, boolean z) {
    }

    @Override // defpackage.o2v0
    public q2v0 e(a aVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.nf00
    public Object f(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        return phonemetadata$PhoneMetadata.f();
    }

    @Override // defpackage.rf31
    public void g(int i) {
    }

    @Override // defpackage.rf31
    public void h(sgx0 sgx0Var, String str, boolean z) {
    }

    @Override // defpackage.rf31
    public void i(ux31 ux31Var) {
    }

    @Override // defpackage.rf31
    public void j(String str) {
    }

    @Override // defpackage.rf31
    public void k() {
    }

    @Override // defpackage.rf31
    public void l() {
    }

    @Override // defpackage.oyy
    public /* bridge */ /* synthetic */ void m(pyy pyyVar, long j, long j2) {
    }

    @Override // defpackage.rf31
    public void n(x0 x0Var, elx0 elx0Var) {
    }

    @Override // defpackage.rhp0
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.rhp0
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.oyy
    public h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        return androidx.media3.exoplayer.upstream.a.e;
    }

    @Override // defpackage.lqd0
    public kqd0 q() {
        return null;
    }

    @Override // defpackage.o2v0
    public boolean supportsFormat(a aVar) {
        return false;
    }

    public /* synthetic */ ity(Object obj) {
    }

    public ity(kse kseVar, el21 el21Var, lqo lqoVar, h3y h3yVar) {
    }

    @Override // defpackage.o2v0
    public int a(a aVar) {
        return 1;
    }
}
