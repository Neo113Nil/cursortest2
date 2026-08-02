package defpackage;

import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.BeginGetCredentialOption;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class kd1 {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ BeginCreateCredentialResponse.Builder i() {
        return new BeginCreateCredentialResponse.Builder();
    }

    public static /* bridge */ /* synthetic */ BeginGetCredentialOption k(Object obj) {
        return (BeginGetCredentialOption) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder o(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder p(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* synthetic */ void u() {
    }
}
