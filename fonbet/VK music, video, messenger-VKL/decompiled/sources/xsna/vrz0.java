package xsna;

import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vrz0 implements CookieStore {
    @Override // java.net.CookieStore
    public final List get(URI uri) {
        return Collections.EMPTY_LIST;
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        return Collections.EMPTY_LIST;
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        return Collections.EMPTY_LIST;
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        return false;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        return false;
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
    }
}
