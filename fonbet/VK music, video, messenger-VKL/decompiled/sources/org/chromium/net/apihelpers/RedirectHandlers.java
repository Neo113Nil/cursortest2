package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;
import xsna.nr;
import xsna.yu50;

/* loaded from: classes8.dex */
public class RedirectHandlers {
    private RedirectHandlers() {
    }

    public static RedirectHandler alwaysFollow() {
        return new nr(28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$alwaysFollow$1(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$neverFollow$0(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        return false;
    }

    public static RedirectHandler neverFollow() {
        return new yu50(6);
    }
}
