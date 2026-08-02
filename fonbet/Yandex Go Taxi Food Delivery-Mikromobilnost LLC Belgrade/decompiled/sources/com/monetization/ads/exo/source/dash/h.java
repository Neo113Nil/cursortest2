package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import defpackage.ef71;
import defpackage.ql61;
import defpackage.rf71;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* loaded from: classes7.dex */
public final class h implements ql61 {
    @Override // defpackage.ql61
    public final Object a(Uri uri, ef71 ef71Var) {
        return Long.valueOf(rf71.B(new BufferedReader(new InputStreamReader(ef71Var)).readLine()));
    }
}
