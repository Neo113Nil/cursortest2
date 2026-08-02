package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.vk.api.generated.money.dto.MoneyNspkMemberDto;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SbpAppsProviderImpl.kt */
/* loaded from: classes4.dex */
public final class w2h0 implements v2h0 {
    public final rm70 a;
    public final Context b;

    public w2h0(Context context, rm70 rm70Var) {
        this.a = rm70Var;
        this.b = context.getApplicationContext();
    }

    @Override // xsna.v2h0
    public final List<p2h0> b(Uri uri) {
        PackageManager packageManager = this.b.getPackageManager();
        List<MoneyNspkMemberDto> d = this.a.d();
        if (d == null) {
            d = EmptyList.b;
        }
        return rli0.A(rli0.t(new i5g(d), new kti(uri, packageManager, this, 3)));
    }
}
