package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vkontakte.android.fragments.WikiViewFragment;

/* compiled from: WikiPageLoaderHelper.kt */
/* loaded from: classes7.dex */
public final class mpx0 extends lpx0 {
    public final /* synthetic */ com.vkontakte.android.fragments.h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpx0(Context context, com.vkontakte.android.fragments.h hVar, Bundle bundle) {
        super(context, bundle);
        this.e = hVar;
    }

    @Override // xsna.lpx0
    public final void a(String str, String str2) {
        WikiViewFragment.a aVar = new WikiViewFragment.a(WikiViewFragment.class, null, null);
        aVar.j.putString("url", str);
        Bundle bundle = this.e.a;
        bundle.putAll(bundle);
        Context context = e43.a;
        aVar.k(context != null ? context : null);
    }
}
