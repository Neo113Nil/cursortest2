package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class eru0 extends i93 {
    public static final UriMatcher x;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        x = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // defpackage.gog
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.i93
    public final void f(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[RETURN] */
    @Override // defpackage.i93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContentResolver contentResolver, Uri uri) {
        InputStream openContactPhotoInputStream;
        int match = x.match(uri);
        if (match != 1) {
            if (match == 3) {
                openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            } else if (match != 5) {
                openContactPhotoInputStream = contentResolver.openInputStream(uri);
            }
            if (openContactPhotoInputStream == null) {
                return openContactPhotoInputStream;
            }
            throw new FileNotFoundException(unr0.n(uri, "InputStream is null for "));
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
        if (openContactPhotoInputStream == null) {
        }
    }
}
