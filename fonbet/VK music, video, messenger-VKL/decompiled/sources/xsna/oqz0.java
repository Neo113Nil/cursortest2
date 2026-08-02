package xsna;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class oqz0 extends a.AbstractC0111a {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, olc olcVar, @Nullable Object obj, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        return new uqz0(context, looper, olcVar, (GoogleSignInOptions) obj, bVar, interfaceC0114c);
    }

    @Override // com.google.android.gms.common.api.a.e
    public final List getImpliedScopes(@Nullable Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.c);
    }
}
