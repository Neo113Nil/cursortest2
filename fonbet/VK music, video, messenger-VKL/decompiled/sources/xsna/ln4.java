package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.vk.clipseditor.utility.exceptions.FileFormatException;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import xsna.fbr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ln4 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ln4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd A[Catch: all -> 0x00d6, TryCatch #6 {all -> 0x00d6, blocks: (B:22:0x0051, B:58:0x00d9, B:60:0x00dd, B:61:0x00de, B:62:0x00e3), top: B:20:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de A[Catch: all -> 0x00d6, TryCatch #6 {all -> 0x00d6, blocks: (B:22:0x0051, B:58:0x00d9, B:60:0x00dd, B:61:0x00de, B:62:0x00e3), top: B:20:0x0051 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        AssetFileDescriptor openAssetFileDescriptor;
        EglBase.EglConnection lambda$create$0;
        switch (this.b) {
            case 0:
                on4 on4Var = (on4) this.c;
                Uri uri = (Uri) this.d;
                Context context = on4Var.a;
                fbr.a aVar = new fbr.a();
                AssetFileDescriptor assetFileDescriptor = null;
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (openAssetFileDescriptor == null) {
                        throw new FileNotFoundException("Cannot open uri: " + uri);
                    }
                    if (openAssetFileDescriptor.getLength() == -1 || openAssetFileDescriptor.getLength() < 0) {
                        throw new FileFormatException("Incorrect fileSize: " + openAssetFileDescriptor.getLength());
                    }
                    long length = openAssetFileDescriptor.getLength();
                    try {
                        openAssetFileDescriptor.close();
                    } catch (Exception unused) {
                    }
                    aVar.d = length;
                    try {
                        try {
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                try {
                                    try {
                                        mediaMetadataRetriever2.setDataSource(context, uri);
                                        String extractMetadata = mediaMetadataRetriever2.extractMetadata(17);
                                        String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(18);
                                        String extractMetadata3 = mediaMetadataRetriever2.extractMetadata(19);
                                        String extractMetadata4 = mediaMetadataRetriever2.extractMetadata(12);
                                        String extractMetadata5 = mediaMetadataRetriever2.extractMetadata(9);
                                        String extractMetadata6 = mediaMetadataRetriever2.extractMetadata(20);
                                        String extractMetadata7 = mediaMetadataRetriever2.extractMetadata(24);
                                        if (extractMetadata == null || extractMetadata.length() == 0) {
                                            throw new FileFormatException(i6n0.a(uri, "File is not a video: "));
                                        }
                                        fbr.d(extractMetadata2, aVar);
                                        fbr.c(extractMetadata3, aVar);
                                        if (extractMetadata4 == null) {
                                            aVar.c = "";
                                        } else {
                                            aVar.c = extractMetadata4;
                                        }
                                        fbr.a(extractMetadata5, aVar);
                                        if (extractMetadata6 != null && extractMetadata6.length() != 0) {
                                            try {
                                                Integer.parseInt(extractMetadata6);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        fbr.b(extractMetadata7, aVar);
                                        mediaMetadataRetriever2.release();
                                        return aVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        if (mediaMetadataRetriever != null) {
                                            mediaMetadataRetriever.release();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    throw new FileFormatException("Unable to retrieve video info from file: " + uri);
                                }
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof FileFormatException) {
                                    throw new FileFormatException(e);
                                }
                                throw e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            if (e instanceof FileFormatException) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    assetFileDescriptor = openAssetFileDescriptor;
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
                break;
            default:
                lambda$create$0 = EglThread.lambda$create$0((EglBase.Context) this.c, (int[]) this.d);
                return lambda$create$0;
        }
    }
}
