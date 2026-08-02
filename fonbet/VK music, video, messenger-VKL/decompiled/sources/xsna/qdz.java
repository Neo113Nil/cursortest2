package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.common.links.contract.AnonymousLinker;
import com.vk.dto.common.actions.ActionOpenUrl;

/* compiled from: LinksBridge.kt */
/* loaded from: classes.dex */
public interface qdz {
    sdz a();

    csl b();

    @ozl
    default boolean c(Context context, Uri uri, Bundle bundle) {
        return false;
    }

    String d();

    maz e();

    urw f();

    AnonymousLinker g();

    rk8 getBrowser();

    @ozl
    void h(Context context, ActionOpenUrl actionOpenUrl, String str);
}
