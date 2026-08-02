package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.attachments.video.VideoSimpleHolderUiDto;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.JsonNull;
import xsna.p4p;

/* compiled from: CuratorBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class alk implements h5p, gn60 {
    public static final alk b = new alk();

    public static void A(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final void B(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void C(String str) {
        throw new IllegalStateException(str);
    }

    public static final void D(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void E(String str) {
        throw new NoSuchElementException(str);
    }

    public static final lk80 F(evk evkVar) {
        return new lk80(evkVar.a, evk.b(evkVar.c), evkVar.e, evkVar.g, evkVar.h, evkVar.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0026, code lost:
    
        if (r3.F == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3.F == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jq6 G(NewsEntry newsEntry, NewsEntry newsEntry2, VideoAttachment videoAttachment) {
        boolean z;
        ShitAttachment shitAttachment;
        VideoFile videoFile;
        String str;
        boolean z2;
        boolean z3;
        Image image;
        String str2;
        boolean z4;
        ArrayList arrayList;
        float f;
        String sb;
        String str3;
        int i;
        ArrayList arrayList2;
        Owner owner;
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            if (!post.dc()) {
            }
            z = true;
            shitAttachment = videoAttachment.h;
            float width = videoAttachment.k.getWidth();
            float height = videoAttachment.k.getHeight();
            VideoFile videoFile2 = videoAttachment.k;
            int duration = videoFile2.getDuration();
            String title = videoAttachment.k.getTitle();
            String str4 = videoAttachment.l;
            String r = videoAttachment.k.r();
            boolean Z9 = videoAttachment.k.Z9();
            boolean c = fxc0.B().c(videoAttachment.k);
            Image image2 = videoAttachment.k.getImage();
            PostInteract postInteract = videoAttachment.g;
            String str5 = postInteract == null ? postInteract.b : null;
            if (videoAttachment.l == null) {
                videoFile = videoFile2;
                str = r;
                z2 = Z9;
                z3 = c;
                image = image2;
                str2 = str5;
                z4 = true;
            } else {
                videoFile = videoFile2;
                str = r;
                z2 = Z9;
                z3 = c;
                image = image2;
                str2 = str5;
                z4 = false;
            }
            int duration2 = videoAttachment.k.getDuration() * 1000;
            VideoFile videoFile3 = videoAttachment.k;
            if (!z) {
                sr10 sr10Var = dy2.a;
                if (!(sr10Var != null ? sr10Var.c() : true)) {
                    arrayList = videoFile3.getImage().b;
                    if (shitAttachment == null) {
                        f = height;
                        sb = null;
                    } else {
                        String str6 = shitAttachment.J;
                        f = height;
                        String str7 = shitAttachment.l;
                        StringBuilder sb2 = new StringBuilder();
                        if (!TextUtils.isEmpty(str7)) {
                            sb2.append(str7);
                        }
                        if (str6.length() > 0) {
                            if (sb2.length() > 0) {
                                sb2.append(' ');
                            }
                            sb2.append(str6);
                        }
                        sb = sb2.toString();
                    }
                    if (shitAttachment == null) {
                        str3 = sb;
                        i = duration2;
                        arrayList2 = arrayList;
                        owner = null;
                    } else {
                        Owner owner2 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                        owner2.c = shitAttachment.F;
                        str3 = sb;
                        i = duration2;
                        arrayList2 = arrayList;
                        ImageSize Cb = shitAttachment.G.Cb(iah0.a(48), true, false);
                        if (Cb != null) {
                            owner2.e = Cb.d.d;
                        }
                        owner = owner2;
                    }
                    return new jq6(videoAttachment, videoFile, shitAttachment, width, f, duration, title, str4, str, z2, z3, image, str2, z4, i, arrayList2, z, owner, str3, shitAttachment == null ? null : shitAttachment.l0 ? shitAttachment.u : shitAttachment.p, shitAttachment != null ? shitAttachment.A : null);
                }
            }
            Image image3 = videoFile3.getImage();
            arrayList = !image3.Db() ? image3.c : image3.b;
            if (shitAttachment == null) {
            }
            if (shitAttachment == null) {
            }
            return new jq6(videoAttachment, videoFile, shitAttachment, width, f, duration, title, str4, str, z2, z3, image, str2, z4, i, arrayList2, z, owner, str3, shitAttachment == null ? null : shitAttachment.l0 ? shitAttachment.u : shitAttachment.p, shitAttachment != null ? shitAttachment.A : null);
        }
        if (newsEntry2 instanceof Post) {
            Post post2 = (Post) newsEntry2;
            if (!post2.dc()) {
            }
            z = true;
            shitAttachment = videoAttachment.h;
            float width2 = videoAttachment.k.getWidth();
            float height2 = videoAttachment.k.getHeight();
            VideoFile videoFile22 = videoAttachment.k;
            int duration3 = videoFile22.getDuration();
            String title2 = videoAttachment.k.getTitle();
            String str42 = videoAttachment.l;
            String r2 = videoAttachment.k.r();
            boolean Z92 = videoAttachment.k.Z9();
            boolean c2 = fxc0.B().c(videoAttachment.k);
            Image image22 = videoAttachment.k.getImage();
            PostInteract postInteract2 = videoAttachment.g;
            if (postInteract2 == null) {
            }
            if (videoAttachment.l == null) {
            }
            int duration22 = videoAttachment.k.getDuration() * 1000;
            VideoFile videoFile32 = videoAttachment.k;
            if (!z) {
            }
            Image image32 = videoFile32.getImage();
            if (!image32.Db()) {
            }
            if (shitAttachment == null) {
            }
            if (shitAttachment == null) {
            }
            return new jq6(videoAttachment, videoFile, shitAttachment, width2, f, duration3, title2, str42, str, z2, z3, image, str2, z4, i, arrayList2, z, owner, str3, shitAttachment == null ? null : shitAttachment.l0 ? shitAttachment.u : shitAttachment.p, shitAttachment != null ? shitAttachment.A : null);
        }
        if (!(newsEntry2 instanceof ShitAttachment) && !(newsEntry instanceof ShitAttachment)) {
            z = false;
            shitAttachment = videoAttachment.h;
            float width22 = videoAttachment.k.getWidth();
            float height22 = videoAttachment.k.getHeight();
            VideoFile videoFile222 = videoAttachment.k;
            int duration32 = videoFile222.getDuration();
            String title22 = videoAttachment.k.getTitle();
            String str422 = videoAttachment.l;
            String r22 = videoAttachment.k.r();
            boolean Z922 = videoAttachment.k.Z9();
            boolean c22 = fxc0.B().c(videoAttachment.k);
            Image image222 = videoAttachment.k.getImage();
            PostInteract postInteract22 = videoAttachment.g;
            if (postInteract22 == null) {
            }
            if (videoAttachment.l == null) {
            }
            int duration222 = videoAttachment.k.getDuration() * 1000;
            VideoFile videoFile322 = videoAttachment.k;
            if (!z) {
            }
            Image image322 = videoFile322.getImage();
            if (!image322.Db()) {
            }
            if (shitAttachment == null) {
            }
            if (shitAttachment == null) {
            }
            return new jq6(videoAttachment, videoFile, shitAttachment, width22, f, duration32, title22, str422, str, z2, z3, image, str2, z4, i, arrayList2, z, owner, str3, shitAttachment == null ? null : shitAttachment.l0 ? shitAttachment.u : shitAttachment.p, shitAttachment != null ? shitAttachment.A : null);
        }
        z = true;
        shitAttachment = videoAttachment.h;
        float width222 = videoAttachment.k.getWidth();
        float height222 = videoAttachment.k.getHeight();
        VideoFile videoFile2222 = videoAttachment.k;
        int duration322 = videoFile2222.getDuration();
        String title222 = videoAttachment.k.getTitle();
        String str4222 = videoAttachment.l;
        String r222 = videoAttachment.k.r();
        boolean Z9222 = videoAttachment.k.Z9();
        boolean c222 = fxc0.B().c(videoAttachment.k);
        Image image2222 = videoAttachment.k.getImage();
        PostInteract postInteract222 = videoAttachment.g;
        if (postInteract222 == null) {
        }
        if (videoAttachment.l == null) {
        }
        int duration2222 = videoAttachment.k.getDuration() * 1000;
        VideoFile videoFile3222 = videoAttachment.k;
        if (!z) {
        }
        Image image3222 = videoFile3222.getImage();
        if (!image3222.Db()) {
        }
        if (shitAttachment == null) {
        }
        if (shitAttachment == null) {
        }
        return new jq6(videoAttachment, videoFile, shitAttachment, width222, f, duration322, title222, str4222, str, z2, z3, image, str2, z4, i, arrayList2, z, owner, str3, shitAttachment == null ? null : shitAttachment.l0 ? shitAttachment.u : shitAttachment.p, shitAttachment != null ? shitAttachment.A : null);
    }

    @NonNull
    public static List H(@Nullable List list) {
        return list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
    }

    public static byte I(@Nullable Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    @Nullable
    public static Boolean J(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static final void a(gzs gzsVar, gzs gzsVar2, izs izsVar, BookingServiceType bookingServiceType, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(339962745);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.o(bookingServiceType.ordinal()) ? 2048 : 1024) | (M.J(semanticsConfiguration) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(339962745, i2, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingCancelRecordConfirmationDialog (BookingCancelRecordConfirmationModal.kt:26)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new zn7(gzsVar, gzsVar2, izsVar, bookingServiceType, semanticsConfiguration);
                M.R(x);
            }
            zn7 zn7Var = (zn7) x;
            ((zak0) zn7Var.a).setValue(gzsVar);
            ((zak0) zn7Var.c).setValue(izsVar);
            ((zak0) zn7Var.b).setValue(gzsVar2);
            ((zak0) zn7Var.d).setValue(bookingServiceType);
            ((zak0) zn7Var.e).setValue(semanticsConfiguration);
            zn7Var.a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ao7(gzsVar, gzsVar2, izsVar, bookingServiceType, semanticsConfiguration, i, 0);
        }
    }

    public static final ad0 b() {
        return new ad0();
    }

    public static final u3r0 c() {
        return new u3r0();
    }

    public static int d(int i, ByteBuffer byteBuffer) {
        if (i <= 63) {
            byteBuffer.put((byte) i);
            return 1;
        }
        if (i <= 16383) {
            byteBuffer.put((byte) ((i / 256) | 64));
            byteBuffer.put((byte) (i % 256));
            return 2;
        }
        if (i <= 1073741823) {
            int position = byteBuffer.position();
            byteBuffer.putInt(i);
            byteBuffer.put(position, (byte) (byteBuffer.get(position) | Byte.MIN_VALUE));
            return 4;
        }
        int position2 = byteBuffer.position();
        byteBuffer.putLong(i);
        byteBuffer.put(position2, (byte) (byteBuffer.get(position2) | (-64)));
        return 8;
    }

    public static int e(long j) {
        if (j <= 63) {
            return 1;
        }
        if (j <= 16383) {
            return 2;
        }
        return j <= 1073741823 ? 4 : 8;
    }

    public static int g(long j, ByteBuffer byteBuffer) {
        if (j <= 2147483647L) {
            return d((int) j, byteBuffer);
        }
        if (j > 4611686018427387903L) {
            throw new IllegalArgumentException("value cannot be encoded in variable-length integer");
        }
        int position = byteBuffer.position();
        byteBuffer.putLong(j);
        byteBuffer.put(position, (byte) (byteBuffer.get(position) | (-64)));
        return 8;
    }

    public static int h(InputStream inputStream) throws IOException {
        long k = k(inputStream);
        if (k <= 2147483647L) {
            return (int) k;
        }
        throw new RuntimeException("value to large for Java int");
    }

    @Deprecated
    public static int i(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq {
        long l = l(byteBuffer);
        if (l <= 2147483647L) {
            return (int) l;
        }
        throw new IllegalArgumentException("value to large for Java int");
    }

    public static int j(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq, one.video.calls.sdk_private.bp {
        long l = l(byteBuffer);
        if (l <= 2147483647L) {
            return (int) l;
        }
        throw new one.video.calls.sdk_private.bp();
    }

    public static long k(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        int i = (read & PsExtractor.AUDIO_STREAM) >> 6;
        if (i == 0) {
            return read;
        }
        if (i == 1) {
            if (inputStream.read() != -1) {
                return ((read & 63) << 8) | (r7 & 255);
            }
            throw new EOFException();
        }
        if (i == 2) {
            int read2 = inputStream.read();
            int read3 = inputStream.read();
            int read4 = inputStream.read();
            if (read2 == -1 || read3 == -1 || read4 == -1) {
                throw new EOFException();
            }
            return ((read & 63) << 24) | ((read2 & 255) << 16) | ((read3 & 255) << 8) | (read4 & 255);
        }
        if (i != 3) {
            throw new RuntimeException();
        }
        byte[] bArr = new byte[8];
        int i2 = 0;
        bArr[0] = (byte) (read & 63);
        while (i2 != 7) {
            int read5 = inputStream.read(bArr, i2 + 1, 7 - i2);
            if (read5 <= 0) {
                throw new EOFException();
            }
            i2 += read5;
        }
        return ByteBuffer.wrap(bArr).getLong();
    }

    public static long l(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq {
        if (byteBuffer.remaining() <= 0) {
            throw new one.video.calls.sdk_private.bq();
        }
        byte b2 = byteBuffer.get();
        int i = (b2 & 192) >> 6;
        if (i == 0) {
            return b2;
        }
        if (i == 1) {
            if (byteBuffer.remaining() <= 0) {
                throw new one.video.calls.sdk_private.bq();
            }
            return byteBuffer.getShort() & 16383;
        }
        if (i == 2) {
            if (byteBuffer.remaining() < 3) {
                throw new one.video.calls.sdk_private.bq();
            }
            return byteBuffer.getInt() & 1073741823;
        }
        if (i != 3) {
            throw new RuntimeException();
        }
        if (byteBuffer.remaining() < 7) {
            throw new one.video.calls.sdk_private.bq();
        }
        return byteBuffer.getLong() & 4611686018427387903L;
    }

    public static Object m(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(lhg.a(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static v64 n(int i, Attachment attachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        int i2;
        Image image;
        Image image2;
        ArrayList arrayList;
        if (i == 0 && (attachment instanceof PhotoAttachment)) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            Photo photo = photoAttachment.l;
            ArrayList arrayList2 = photo.y.b;
            ImageSize imageSize = (ImageSize) ixj0.b(arrayList2);
            int i3 = imageSize != null ? imageSize.d.b : 0;
            i2 = imageSize != null ? imageSize.d.c : 0;
            boolean z = photo.r;
            if (i3 <= 0) {
                i3 = iah0.a(135);
            }
            int i4 = i3;
            if (i2 <= 0) {
                i2 = iah0.a(100);
            }
            return new w9a0(photoAttachment, arrayList2, z, i4, i2);
        }
        if (i == 10 && (attachment instanceof PhotoAttachment)) {
            PhotoAttachment photoAttachment2 = (PhotoAttachment) attachment;
            Photo photo2 = photoAttachment2.l;
            ImageSize imageSize2 = (ImageSize) ixj0.b(photo2.y.b);
            int i5 = imageSize2 != null ? imageSize2.d.b : 0;
            i2 = imageSize2 != null ? imageSize2.d.c : 0;
            if (i5 <= 0) {
                i5 = iah0.a(135);
            }
            if (i2 <= 0) {
                i2 = iah0.a(100);
            }
            return new aba0(photoAttachment2, photo2, i5, i2);
        }
        if (i == 11 && (attachment instanceof PhotoAttachment)) {
            PhotoAttachment photoAttachment3 = (PhotoAttachment) attachment;
            Photo photo3 = photoAttachment3.l;
            ImageSize imageSize3 = (ImageSize) ixj0.b(photo3.y.b);
            int i6 = imageSize3 != null ? imageSize3.d.b : 0;
            i2 = imageSize3 != null ? imageSize3.d.c : 0;
            String Ib = photoAttachment3.Ib();
            if (i6 <= 0) {
                i6 = iah0.a(135);
            }
            int i7 = i6;
            if (i2 <= 0) {
                i2 = iah0.a(100);
            }
            return new p5a0(photoAttachment3, photo3, Ib, i7, i2);
        }
        ArrayList arrayList3 = null;
        if (i == 2 && (attachment instanceof AlbumAttachment)) {
            AlbumAttachment albumAttachment = (AlbumAttachment) attachment;
            Photo photo4 = albumAttachment.l;
            ArrayList arrayList4 = photo4.y.b;
            ImageSize imageSize4 = (ImageSize) ixj0.b(arrayList4);
            int i8 = imageSize4 != null ? imageSize4.d.b : 0;
            int i9 = imageSize4 != null ? imageSize4.d.c : 0;
            boolean Ib2 = photo4.Ib();
            boolean Hb = photo4.Hb();
            ArrayList arrayList5 = (!Ib2 || Hb) ? arrayList4 : null;
            String f = uqm0.f(albumAttachment.y);
            boolean z2 = !Ib2 && arrayList4.isEmpty();
            if (i8 <= 0) {
                i8 = iah0.a(135);
            }
            int i10 = i8;
            if (i9 <= 0) {
                i9 = iah0.a(100);
            }
            return new w4a0(albumAttachment, Ib2, Hb, f, arrayList5, z2, i10, i9);
        }
        if (i != 3 || !(attachment instanceof MarketAlbumAttachment)) {
            if (i == 1 && (attachment instanceof VideoAttachment)) {
                VideoAttachment videoAttachment = (VideoAttachment) attachment;
                Object a0 = j5g.a0(new vgt0().x(new mds0(1, newsEntry, newsEntry2, videoAttachment), null));
                VideoSimpleHolderUiDto videoSimpleHolderUiDto = a0 instanceof VideoSimpleHolderUiDto ? (VideoSimpleHolderUiDto) a0 : null;
                if (videoSimpleHolderUiDto != null) {
                    return new vns0(videoSimpleHolderUiDto, videoAttachment, videoAttachment.k.getWidth() > 0 ? videoAttachment.k.getWidth() : iah0.a(360), videoAttachment.k.getHeight() > 0 ? videoAttachment.k.getHeight() : iah0.a(179));
                }
            } else {
                if (i == 4 && (attachment instanceof DocumentAttachment)) {
                    return fo50.L((DocumentAttachment) attachment, i);
                }
                if (i == 5 && (attachment instanceof DocumentAttachment)) {
                    return fo50.L((DocumentAttachment) attachment, i);
                }
            }
            return null;
        }
        MarketAlbumAttachment marketAlbumAttachment = (MarketAlbumAttachment) attachment;
        GoodAlbum goodAlbum = marketAlbumAttachment.f;
        Photo photo5 = goodAlbum.e;
        ImageSize imageSize5 = (photo5 == null || (image2 = photo5.y) == null || (arrayList = image2.b) == null) ? null : (ImageSize) ixj0.b(arrayList);
        int i11 = imageSize5 != null ? imageSize5.d.b : 0;
        i2 = imageSize5 != null ? imageSize5.d.c : 0;
        int i12 = goodAlbum.f;
        String f2 = uqm0.f(i12);
        int i13 = goodAlbum.b;
        UserId userId = goodAlbum.c;
        int i14 = goodAlbum.h == 1 ? R.plurals.services_count : R.plurals.goods_count;
        Photo photo6 = goodAlbum.e;
        if (photo6 != null && (image = photo6.y) != null) {
            arrayList3 = image.b;
        }
        ArrayList arrayList6 = arrayList3;
        if (i11 <= 0) {
            i11 = iah0.a(135);
        }
        int i15 = i11;
        if (i2 <= 0) {
            i2 = iah0.a(100);
        }
        return new sr00(marketAlbumAttachment, i13, userId, i14, i12, f2, arrayList6, i15, i2);
    }

    public static d9l o(List list, List list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(obj instanceof c9l)) {
                throw new IllegalStateException("There must be elements that implement the DeduplicationItem interface or a deduplicationKeyProvider is provided");
            }
            linkedHashSet.add(((c9l) obj).b1());
        }
        for (Object obj2 : list2) {
            if (!(obj2 instanceof c9l)) {
                throw new IllegalStateException("There must be elements that implement the DeduplicationItem interface or a deduplicationKeyProvider is provided");
            }
            if (linkedHashSet.add(((c9l) obj2).b1())) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        return new d9l(arrayList, arrayList2);
    }

    public static int p(float f) {
        return (int) Math.floor(f * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int q(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static z8p0 r(rco0 rco0Var, float f, iy5 iy5Var, PictureRadius pictureRadius, androidx.compose.runtime.a aVar, int i) {
        rco0 rco0Var2;
        if ((i & 2) != 0) {
            f = 56;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            iy5Var = rep.a;
        }
        if ((i & 8) != 0) {
            pictureRadius = PictureRadius.Medium;
        }
        PictureRadius pictureRadius2 = pictureRadius;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(422998569, 196608, -1, "com.vk.core.compose.component.placeholder.Placeholder.Top.Picture.Companion.invoke (Placeholder.kt:175)");
        }
        List singletonList = Collections.singletonList(iy5Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-437251115, 6, -1, "com.vk.core.compose.component.placeholder.remember (TopPictureImpl.kt:84)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            rco0Var2 = rco0Var;
            z8p0 z8p0Var = new z8p0(rco0Var2, f2, singletonList, pictureRadius2, null);
            aVar.R(z8p0Var);
            x = z8p0Var;
        } else {
            rco0Var2 = rco0Var;
        }
        z8p0 z8p0Var2 = (z8p0) x;
        ((zak0) z8p0Var2.a).setValue(rco0Var2);
        ((zak0) z8p0Var2.b).setValue(new pco(f2));
        ((zak0) z8p0Var2.c).setValue(new wow(singletonList));
        ((zak0) z8p0Var2.e).setValue(pictureRadius2);
        ((zak0) z8p0Var2.d).setValue(null);
        ((zak0) z8p0Var2.f).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z8p0Var2;
    }

    public static int s(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final void t(y9y y9yVar, String str, Boolean bool) {
        qzw qzwVar = c9y.a;
        y9yVar.b(str, bool == null ? JsonNull.INSTANCE : new o9y(bool, false, null));
    }

    public static final void u(y9y y9yVar, String str, String str2) {
        y9yVar.b(str, c9y.b(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        A(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = s(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int r = egi.r(obj);
        int i2 = r & i;
        int z = z(i2, obj3);
        if (z != 0) {
            int i3 = ~i;
            int i4 = r & i3;
            int i5 = -1;
            while (true) {
                int i6 = z - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !pli.l(obj, objArr[i6]) || (objArr2 != null && !pli.l(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    z = i8;
                }
            }
        }
        return -1;
    }

    public static final void w(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static int z(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        ag5 ag5Var = (ag5) g5pVar;
        if (ota0Var == null) {
            return null;
        }
        float f = ag5Var.a / 100.0f;
        if (!(ota0Var instanceof ld7)) {
            throw new IllegalArgumentException("image is not BitmapWrapper");
        }
        Bitmap bitmap = ((ld7) ota0Var).a;
        PhotoEditorEngine.d(bitmap, f);
        return new ld7(bitmap);
    }
}
