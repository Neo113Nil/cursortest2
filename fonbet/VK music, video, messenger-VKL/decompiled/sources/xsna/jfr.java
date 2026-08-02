package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.media.MediaFilteringStrategy;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: FilteringUtilsImpl.kt */
/* loaded from: classes6.dex */
public final class jfr implements ifr {

    /* compiled from: FilteringUtilsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaFilteringStrategy.values().length];
            try {
                iArr[MediaFilteringStrategy.ANY_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaFilteringStrategy.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaFilteringStrategy.VIDEO_AVC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaFilteringStrategy.VIDEO_AVC_HEVC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaFilteringStrategy.ANY_VIDEO_WITH_AUDIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(Uri uri, bpn0 bpn0Var) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        Context context = e43.a;
        String str3 = null;
        if (context == null) {
            context = null;
        }
        if (epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
            String type = epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? context.getContentResolver().getType(uri) : null;
            if (type == null) {
                str2 = null;
            } else {
                str2 = "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
            }
            if (str2 != null) {
                z = brm0.v(str2, ".mp4", false);
            }
            z = false;
        } else {
            String uri2 = uri.toString();
            if (!TextUtils.isEmpty(uri2) && brm0.v(uri2, ".mp4", true)) {
                z = true;
            }
            z = false;
        }
        if (!z) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            if (epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                String type2 = epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? context2.getContentResolver().getType(uri) : null;
                if (type2 != null) {
                    str3 = "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(type2);
                }
                if (str3 != null) {
                    z2 = brm0.v(str3, ".3gp", false);
                    if (!z2) {
                        MediaUtils.f fVar = (MediaUtils.f) bpn0Var.getValue();
                        if (!((fVar == null || (str = fVar.h) == null || !str.equalsIgnoreCase("video/avc")) ? false : true)) {
                            return false;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            } else {
                String uri3 = uri.toString();
                if (!TextUtils.isEmpty(uri3) && brm0.v(uri3, ".3gp", true)) {
                    z2 = true;
                    if (!z2) {
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0010 A[SYNTHETIC] */
    @Override // xsna.ifr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vil0 a(List list, MediaFilteringStrategy mediaFilteringStrategy) {
        boolean z;
        MediaUtils.f fVar;
        String str;
        pro0.b();
        vil0 vil0Var = new vil0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) it.next();
                String path = mediaStoreEntry.f().getPath();
                if (path != null && path.length() != 0 && (epx.f(mediaStoreEntry.f().getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) || com.vk.core.files.a.y(path))) {
                    boolean z2 = mediaStoreEntry instanceof MediaStoreVideoEntry;
                    ArrayList<MediaStoreEntry> arrayList = vil0Var.a;
                    if (z2) {
                        Uri f = mediaStoreEntry.f();
                        bpn0 bpn0Var = new bpn0(new dgm(f, 6));
                        int i = a.$EnumSwitchMapping$0[mediaFilteringStrategy.ordinal()];
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                z = c(f, bpn0Var);
                            } else if (i != 4) {
                                if (i != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Context context = e43.a;
                                if (context == null) {
                                    context = null;
                                }
                                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                p490.z(new js00(2, context, f), new com.vk.movika.tools.controls.seekbar.h(ref$BooleanRef, 8));
                                z = ref$BooleanRef.element;
                            } else if (!c(f, bpn0Var) && ((fVar = (MediaUtils.f) bpn0Var.getValue()) == null || (str = fVar.h) == null || !str.equalsIgnoreCase("video/hevc"))) {
                                z = false;
                            }
                            if (!z) {
                                arrayList.add(mediaStoreEntry);
                                if (z2) {
                                    vil0Var.c++;
                                } else {
                                    vil0Var.b++;
                                }
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                    } else if (!sdy.p(mediaStoreEntry)) {
                        arrayList.add(mediaStoreEntry);
                        if (z2) {
                            vil0Var.c++;
                        } else {
                            vil0Var.b++;
                        }
                    }
                }
            }
        }
        return vil0Var;
    }

    @Override // xsna.ifr
    public final ArrayList b(List list, MediaFilteringStrategy mediaFilteringStrategy) {
        pro0.b();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AlbumEntry albumEntry = (AlbumEntry) it.next();
                vil0 a2 = a(albumEntry.d, mediaFilteringStrategy);
                ArrayList<MediaStoreEntry> arrayList2 = a2.a;
                if (!arrayList2.isEmpty()) {
                    arrayList.add(AlbumEntry.a(albumEntry, arrayList2, a2.b + a2.c, 43));
                }
            }
        }
        return arrayList;
    }
}
