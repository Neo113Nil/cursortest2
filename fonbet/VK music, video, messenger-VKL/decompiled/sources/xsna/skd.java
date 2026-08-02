package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.google.android.gms.internal.measurement.zznz;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemColorDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderBackgroundDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderBadgeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDescriptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderIconDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderOverlayImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTitleDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.user.SocialButtonType;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderBadge;
import com.vk.feed.core.models.header.HeaderIcon;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLException;
import kotlin.collections.EmptyList;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: ClipsButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class skd implements q701, gn60, io.reactivex.rxjava3.functions.c, kg7 {
    public static final skd b = new skd();
    public static final int[] c = {-1, -16777216, -1685946, -29623, -403417, -13714872, -12482072, -6337555, -9837389, -31584, -546440, -493460, -7654862, -7096744, -11178443, -10795888, -15000805, -13421773, -11711155, -10066330, -8355712, -6710887, -5000269, -3355444};
    public static final char[] d = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final /* synthetic */ skd e = new skd();

    public static long[] b(long[] jArr, long... jArr2) {
        if (jArr == null) {
            jArr = new long[0];
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static String c(int i, byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i > 0 ? length / i : 0)];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i > 0 && i3 % i == 0 && i2 > 0) {
                cArr[i2] = '-';
                i2++;
            }
            int i4 = i2 + 1;
            byte b2 = bArr[i3];
            char[] cArr2 = d;
            cArr[i2] = cArr2[(b2 & 240) >>> 4];
            i2 += 2;
            cArr[i4] = cArr2[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
        }
        return new String(cArr);
    }

    public static final String d(Thumb thumb, float f, androidx.compose.runtime.a aVar) {
        String str;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(329069448, 48, -1, "com.vk.music.playlist.framework.presentation.getForSizeOrEmpty (Util.kt:26)");
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        if (thumb != null) {
            int I0 = (int) azlVar.I0(f);
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            str = thumb.Ab(I0, false);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return str;
    }

    public static final long e(jfo jfoVar) {
        float x = jfoVar.a.getX();
        float y = jfoVar.a.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static SimpleDateFormat f(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(lhg.a(i, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(lhg.a(i2, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static boolean g(Attachment attachment) {
        if (!(attachment instanceof SnippetAttachment)) {
            return false;
        }
        SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
        return !(snippetAttachment.t || snippetAttachment.G == null) || snippetAttachment.Eb();
    }

    public static final boolean h(Throwable th) {
        if (th instanceof InterruptedException) {
            return true;
        }
        return (th instanceof InterruptedIOException) && Thread.currentThread().isInterrupted();
    }

    public static final boolean i(Throwable th) {
        return (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof SSLException) || (th instanceof ProtocolException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r5 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0291  */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EntryHeader j(NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Map map) {
        SourcePhoto sourcePhoto;
        HeaderTitle headerTitle;
        HeaderBadge headerBadge;
        ArrayList arrayList;
        SocialButtonType socialButtonType;
        NewsfeedNewsfeedItemHeaderIconDto g;
        HeaderIcon headerIcon;
        ThemedColor themedColor;
        Text text;
        ThemedColor themedColor2;
        NewsfeedNewsfeedItemColorDto d2;
        ThemedColor themedColor3;
        List<UserId> m;
        List arrayList2;
        Owner owner;
        VerifyInfo verifyInfo;
        ThemedColor themedColor4;
        List singletonList;
        Owner owner2;
        NewsfeedNewsfeedItemHeaderImageDto j = newsfeedNewsfeedItemHeaderDto.j();
        if (j != null) {
            List<UserId> j2 = j.j();
            if (j2 != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = j2.iterator();
                while (it.hasNext()) {
                    Owner owner3 = map != null ? (Owner) map.get((UserId) it.next()) : null;
                    if (owner3 != null) {
                        arrayList3.add(owner3);
                    }
                }
                boolean isEmpty = arrayList3.isEmpty();
                singletonList = arrayList3;
                if (isEmpty) {
                    singletonList = null;
                }
            }
            singletonList = (map == null || (owner2 = (Owner) map.get(j.i())) == null) ? null : Collections.singletonList(owner2);
            List<PhotosPhotoSizesDto> g2 = j.g();
            sourcePhoto = new SourcePhoto(singletonList, g2 != null ? elg.a(g2) : null, j.e());
        } else {
            sourcePhoto = null;
        }
        NewsfeedNewsfeedItemHeaderTitleDto k = newsfeedNewsfeedItemHeaderDto.k();
        if (k != null) {
            UserId d3 = k.d();
            List<UserId> e2 = k.e();
            if (e2 != null) {
                List<UserId> list = e2;
                if (list.isEmpty()) {
                    list = e43.m(k.d());
                }
                m = list;
            }
            m = e43.m(k.d());
            List<UserId> list2 = m;
            Owner owner4 = (d3 == null || map == null) ? null : (Owner) map.get(d3);
            NewsfeedNewsfeedItemHeaderTextDto f = k.f();
            if (f != null) {
                String e3 = f.e();
                NewsfeedNewsfeedItemColorDto d4 = f.d();
                if (d4 != null) {
                    String e4 = d4.e();
                    Integer a = e4 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e4) : null;
                    String d5 = d4.d();
                    themedColor4 = new ThemedColor(a, d5 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d5) : null);
                } else {
                    themedColor4 = null;
                }
                arrayList2 = Collections.singletonList(new Text(e3, themedColor4));
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str = (map == null || (owner = (Owner) map.get((UserId) it2.next())) == null) ? null : owner.c;
                    if (str != null) {
                        arrayList4.add(str);
                    }
                }
                arrayList2 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new Text((String) it3.next(), null));
                }
            }
            headerTitle = new HeaderTitle(list2, arrayList2, owner4 != null ? owner4.k : null, (owner4 == null || (verifyInfo = owner4.f) == null) ? new VerifyInfo(false, false, false, false, false, false, 63, null) : verifyInfo, owner4 != null && owner4.i(256), owner4 != null && owner4.i(8192), owner4 != null && owner4.i(16384));
        } else {
            headerTitle = null;
        }
        NewsfeedNewsfeedItemHeaderBadgeDto d6 = newsfeedNewsfeedItemHeaderDto.d();
        if (d6 != null) {
            NewsfeedNewsfeedItemHeaderTextDto e5 = d6.e();
            if (e5 != null) {
                String e6 = e5.e();
                NewsfeedNewsfeedItemColorDto d7 = e5.d();
                if (d7 != null) {
                    String e7 = d7.e();
                    Integer a2 = e7 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e7) : null;
                    String d8 = d7.d();
                    themedColor3 = new ThemedColor(a2, d8 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d8) : null);
                } else {
                    themedColor3 = null;
                }
                text = new Text(e6, themedColor3);
            } else {
                text = null;
            }
            NewsfeedNewsfeedItemHeaderBackgroundDto d9 = d6.d();
            if (d9 == null || (d2 = d9.d()) == null) {
                themedColor2 = null;
            } else {
                String e8 = d2.e();
                Integer a3 = e8 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e8) : null;
                String d10 = d2.d();
                themedColor2 = new ThemedColor(a3, d10 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d10) : null);
            }
            headerBadge = new HeaderBadge(text, themedColor2);
        } else {
            headerBadge = null;
        }
        List<NewsfeedNewsfeedItemHeaderDescriptionDto> f2 = newsfeedNewsfeedItemHeaderDto.f();
        if (f2 != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator<NewsfeedNewsfeedItemHeaderDescriptionDto> it4 = f2.iterator();
            while (it4.hasNext()) {
                arrayList5.add(rdi.w(it4.next(), map));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        NewsfeedNewsfeedItemHeaderOverlayImageDto i = newsfeedNewsfeedItemHeaderDto.i();
        OverlayImage D = i != null ? nr2.D(i, map) : null;
        String l = newsfeedNewsfeedItemHeaderDto.l();
        Integer e9 = newsfeedNewsfeedItemHeaderDto.e();
        NewsfeedNewsfeedItemHeaderTitleDto k2 = newsfeedNewsfeedItemHeaderDto.k();
        if (k2 != null) {
            Owner owner5 = map != null ? (Owner) map.get(k2.d()) : null;
            if (owner5 != null) {
                socialButtonType = owner5.s;
                g = newsfeedNewsfeedItemHeaderDto.g();
                if (g == null) {
                    String g3 = g.g();
                    NewsfeedNewsfeedItemColorDto f3 = g.f();
                    if (f3 != null) {
                        String e10 = f3.e();
                        Integer a4 = e10 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e10) : null;
                        String d11 = f3.d();
                        themedColor = new ThemedColor(a4, d11 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d11) : null);
                    } else {
                        themedColor = null;
                    }
                    NewsfeedNewsfeedItemHeaderActionDto e11 = g.e();
                    headerIcon = new HeaderIcon(g3, themedColor, e11 != null ? ju60.a(e11, map) : null, cqm0.a(g.d()));
                } else {
                    headerIcon = null;
                }
                return new EntryHeader(sourcePhoto, headerTitle, headerBadge, arrayList, D, l, e9, socialButtonType, headerIcon);
            }
        }
        socialButtonType = null;
        g = newsfeedNewsfeedItemHeaderDto.g();
        if (g == null) {
        }
        return new EntryHeader(sourcePhoto, headerTitle, headerBadge, arrayList, D, l, e9, socialButtonType, headerIcon);
    }

    public static final void k(CameraVideoEncoderParameters cameraVideoEncoderParameters, txl0 txl0Var) {
        cameraVideoEncoderParameters.p = txl0Var.a;
        cameraVideoEncoderParameters.q = txl0Var.b;
        cameraVideoEncoderParameters.r = txl0Var.c;
        cameraVideoEncoderParameters.s = txl0Var.d;
        cameraVideoEncoderParameters.t = txl0Var.e;
        cameraVideoEncoderParameters.u = txl0Var.f;
        cameraVideoEncoderParameters.v = txl0Var.g;
        cameraVideoEncoderParameters.x = txl0Var.h;
    }

    public static final wh50 l(Object obj, wzs wzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(10454275, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(obj);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        s3q0 s3q0Var = s3q0.a;
        boolean y = aVar.y(wzsVar);
        Object x2 = aVar.x();
        if (y || x2 == c0012a) {
            x2 = new cbk0(wzsVar, wh50Var, null);
            aVar.R(x2);
        }
        bap.g(s3q0Var, (wzs) x2, aVar, 6);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static final boolean m(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1462196670, 0, -1, "com.vk.music.playlist.framework.presentation.rememberIsMobileUI (Util.kt:65)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            HashSet hashSet = iah0.a;
            x = Boolean.valueOf(fnj.c(context));
            aVar.R(x);
        }
        boolean booleanValue = ((Boolean) x).booleanValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return booleanValue;
    }

    @Override // xsna.kg7
    public Bitmap a(Bitmap bitmap, float f) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, 3, (int) f);
        return bitmap;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return j5g.u0((List) obj2, (List) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public List x(NewsEntry newsEntry, wm60 wm60Var) {
        boolean z;
        float f;
        String str;
        ButtonAction buttonAction;
        Drawable drawable;
        AwayLink awayLink;
        wjz0 content;
        ButtonAction buttonAction2;
        AwayLink awayLink2;
        Post post;
        ArrayList<EntryAttachment> arrayList;
        List<EntryAttachment> N7;
        boolean z2 = true;
        String str2 = "";
        boolean z3 = false;
        if (di60.y(newsEntry)) {
            if (newsEntry instanceof NewsEntryWithAttachments) {
                Iterator<T> it = ((NewsEntryWithAttachments) newsEntry).Gb().iterator();
                buttonAction2 = null;
                awayLink2 = null;
                while (it.hasNext()) {
                    Attachment attachment = ((EntryAttachment) it.next()).b;
                    if (attachment instanceof VideoSnippetAttachment) {
                        VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) attachment;
                        awayLink2 = videoSnippetAttachment.p;
                        str2 = videoSnippetAttachment.u;
                        if (str2 == null) {
                            return EmptyList.b;
                        }
                        buttonAction2 = videoSnippetAttachment.w;
                        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON;
                        smbAdFeatures.getClass();
                        z3 = com.vk.toggle.b.A.a(smbAdFeatures);
                    } else if ((attachment instanceof SnippetAttachment) && g(attachment)) {
                        SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
                        str2 = snippetAttachment.k;
                        buttonAction2 = snippetAttachment.v;
                        z3 = true;
                    }
                }
            } else {
                buttonAction2 = null;
                awayLink2 = null;
            }
            if ((newsEntry instanceof fsx0) && (N7 = ((fsx0) newsEntry).N7()) != null) {
                Iterator<T> it2 = N7.iterator();
                while (it2.hasNext()) {
                    Attachment attachment2 = ((EntryAttachment) it2.next()).b;
                    if (attachment2 instanceof VideoSnippetAttachment) {
                        VideoSnippetAttachment videoSnippetAttachment2 = (VideoSnippetAttachment) attachment2;
                        AwayLink awayLink3 = videoSnippetAttachment2.p;
                        String str3 = videoSnippetAttachment2.u;
                        if (str3 == null) {
                            return EmptyList.b;
                        }
                        buttonAction2 = videoSnippetAttachment2.w;
                        SmbAdFeatures smbAdFeatures2 = SmbAdFeatures.FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON;
                        smbAdFeatures2.getClass();
                        boolean a = com.vk.toggle.b.A.a(smbAdFeatures2);
                        awayLink2 = awayLink3;
                        str2 = str3;
                        z3 = a;
                    } else if ((attachment2 instanceof SnippetAttachment) && g(attachment2)) {
                        SnippetAttachment snippetAttachment2 = (SnippetAttachment) attachment2;
                        str2 = snippetAttachment2.k;
                        buttonAction2 = snippetAttachment2.v;
                        z3 = true;
                    }
                }
            }
            if ((newsEntry instanceof Post) && (post = ((Post) newsEntry).D) != null && (arrayList = post.z) != null) {
                Iterator<T> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Attachment attachment3 = ((EntryAttachment) it3.next()).b;
                    if (attachment3 instanceof VideoSnippetAttachment) {
                        VideoSnippetAttachment videoSnippetAttachment3 = (VideoSnippetAttachment) attachment3;
                        AwayLink awayLink4 = videoSnippetAttachment3.p;
                        String str4 = videoSnippetAttachment3.u;
                        if (str4 == null) {
                            return EmptyList.b;
                        }
                        buttonAction2 = videoSnippetAttachment3.w;
                        SmbAdFeatures smbAdFeatures3 = SmbAdFeatures.FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON;
                        smbAdFeatures3.getClass();
                        boolean a2 = com.vk.toggle.b.A.a(smbAdFeatures3);
                        awayLink2 = awayLink4;
                        str2 = str4;
                        z3 = a2;
                    } else if ((attachment3 instanceof SnippetAttachment) && g(attachment3)) {
                        SnippetAttachment snippetAttachment3 = (SnippetAttachment) attachment3;
                        str2 = snippetAttachment3.k;
                        buttonAction2 = snippetAttachment3.v;
                        z3 = true;
                    }
                }
            }
            if (newsEntry instanceof PromoPost) {
                Iterator<T> it4 = ((PromoPost) newsEntry).n.z.iterator();
                while (it4.hasNext()) {
                    Attachment attachment4 = ((EntryAttachment) it4.next()).b;
                    if (attachment4 instanceof VideoSnippetAttachment) {
                        VideoSnippetAttachment videoSnippetAttachment4 = (VideoSnippetAttachment) attachment4;
                        AwayLink awayLink5 = videoSnippetAttachment4.p;
                        String str5 = videoSnippetAttachment4.u;
                        if (str5 == null) {
                            return EmptyList.b;
                        }
                        buttonAction2 = videoSnippetAttachment4.w;
                        SmbAdFeatures smbAdFeatures4 = SmbAdFeatures.FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON;
                        smbAdFeatures4.getClass();
                        boolean a3 = com.vk.toggle.b.A.a(smbAdFeatures4);
                        awayLink2 = awayLink5;
                        str2 = str5;
                        z3 = a3;
                    } else if ((attachment4 instanceof SnippetAttachment) && g(attachment4)) {
                        SnippetAttachment snippetAttachment4 = (SnippetAttachment) attachment4;
                        str2 = snippetAttachment4.k;
                        buttonAction2 = snippetAttachment4.v;
                        z3 = true;
                    }
                }
            }
            f = 0.0f;
            drawable = null;
            z = z3;
            awayLink = awayLink2;
            buttonAction = buttonAction2;
        } else {
            if (!(newsEntry instanceof ShitAttachment)) {
                if (!(newsEntry instanceof MyTargetNativeAdEntry)) {
                    return EmptyList.b;
                }
                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) newsEntry;
                gjx gjxVar = myTargetNativeAdEntry.B;
                if (gjxVar != null && (content = gjxVar.getContent()) != null) {
                    str2 = content.a.n();
                }
                if (myTargetNativeAdEntry.t == null && !myTargetNativeAdEntry.D) {
                    z2 = false;
                }
                z = z2;
                f = 0.0f;
                str = str2;
                buttonAction = null;
                drawable = null;
                awayLink = null;
                return Collections.singletonList(new uf0(str, buttonAction, z, f, newsEntry, drawable, awayLink));
            }
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            str2 = shitAttachment.u;
            if (!shitAttachment.l0 || drm0.N(str2)) {
                str2 = shitAttachment.p;
            }
            float f2 = shitAttachment.t;
            Drawable a4 = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? dhr0.t.a(R.drawable.vk_icon_favorite_16) : null;
            if (shitAttachment.H == null && !shitAttachment.Hb()) {
                z2 = false;
            }
            z = z2;
            drawable = a4;
            buttonAction = null;
            awayLink = null;
            f = f2;
        }
        str = str2;
        return Collections.singletonList(new uf0(str, buttonAction, z, f, newsEntry, drawable, awayLink));
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zznz.zzf());
    }
}
