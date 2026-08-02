package xsna;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.ImageRequest;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalContentUriFetchProducer.kt */
/* loaded from: classes12.dex */
public final class guz extends luz {
    public final ContentResolver c;

    public guz(Executor executor, b320 b320Var, ContentResolver contentResolver) {
        super(executor, b320Var);
        this.c = contentResolver;
    }

    @Override // xsna.luz
    public final rip d(ImageRequest imageRequest) throws IOException {
        rip ripVar;
        ParcelFileDescriptor openFileDescriptor;
        InputStream createInputStream;
        Uri uri = imageRequest.b;
        Uri uri2 = meq0.a;
        String path = uri.getPath();
        ContentResolver contentResolver = this.c;
        if (path != null && HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(meq0.b(uri)) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(meq0.a.getPath())) {
            if (brm0.v(uri.toString(), "/photo", false)) {
                createInputStream = contentResolver.openInputStream(uri);
            } else if (brm0.v(uri.toString(), "/display_photo", false)) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (openAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    createInputStream = openAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException(i6n0.a(uri, "Contact photo does not exist: "));
                }
            } else {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                if (openContactPhotoInputStream == null) {
                    throw new IOException(i6n0.a(uri, "Contact photo does not exist: "));
                }
                createInputStream = openContactPhotoInputStream;
            }
            if (createInputStream != null) {
                return c(createInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String uri3 = uri.toString();
        if (uri3.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri3.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused2) {
                ripVar = null;
            }
            if (openFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ripVar = c(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
            openFileDescriptor.close();
            if (ripVar != null) {
                return ripVar;
            }
        }
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream != null) {
            return c(openInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // xsna.luz
    public final String e() {
        return "LocalContentUriFetchProducer";
    }
}
