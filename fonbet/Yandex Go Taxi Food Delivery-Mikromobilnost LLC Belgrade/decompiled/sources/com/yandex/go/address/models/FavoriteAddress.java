package com.yandex.go.address.models;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.auu0;
import defpackage.b0t;
import defpackage.b64;
import defpackage.d6p;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.yjd;
import defpackage.zzs;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@gsq0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0003XYZR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R \u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\b\u001a\u0004\b*\u0010+R\"\u0010-\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010\b\u001a\u0004\b.\u0010+R\"\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u0004\u0012\u0004\b2\u0010\b\u001a\u0004\b1\u0010\u0006R\"\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u0004\u0012\u0004\b5\u0010\b\u001a\u0004\b4\u0010\u0006R\"\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u0004\u0012\u0004\b8\u0010\b\u001a\u0004\b7\u0010\u0006R\"\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010\u0004\u0012\u0004\b;\u0010\b\u001a\u0004\b:\u0010\u0006R\"\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010\u0004\u0012\u0004\b>\u0010\b\u001a\u0004\b=\u0010\u0006R\"\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010\u0004\u0012\u0004\bA\u0010\b\u001a\u0004\b@\u0010\u0006R\"\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010\u0004\u0012\u0004\bD\u0010\b\u001a\u0004\bC\u0010\u0006R\"\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010\u0004\u0012\u0004\bG\u0010\b\u001a\u0004\bF\u0010\u0006R\"\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010\u0004\u0012\u0004\bJ\u0010\b\u001a\u0004\bI\u0010\u0006R \u0010K\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010\u0004\u0012\u0004\bM\u0010\b\u001a\u0004\bL\u0010\u0006R\"\u0010N\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010\u0004\u0012\u0004\bP\u0010\b\u001a\u0004\bO\u0010\u0006R\"\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010\u0004\u0012\u0004\bS\u0010\b\u001a\u0004\bR\u0010\u0006R\"\u0010T\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bT\u0010\u0004\u0012\u0004\bV\u0010\b\u001a\u0004\bU\u0010\u0006¨\u0006["}, d2 = {"Lcom/yandex/go/address/models/FavoriteAddress;", "Ljava/io/Serializable;", "", "id", "Ljava/lang/String;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "()Ljava/lang/String;", "getId$annotations", "()V", "", "version", CA20Status.STATUS_USER_I, "m", "()I", "getVersion$annotations", "shortText", "D1", "getShortText$annotations", "fullText", "h", "getFullText$annotations", "Lzzs;", IssuingDistributionPointExtension.POINT, "Lzzs;", "l", "()Lzzs;", "getPoint$annotations", "Lcom/yandex/go/address/models/PlaceType;", "placeType", "Lcom/yandex/go/address/models/PlaceType;", "F0", "()Lcom/yandex/go/address/models/PlaceType;", "getPlaceType$annotations", "Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "datumType", "Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "P0", "()Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "getDatumType$annotations", "Lcom/yandex/go/address/models/FavoriteAddress$FavoriteTitle;", "addressTitle", "Lcom/yandex/go/address/models/FavoriteAddress$FavoriteTitle;", "getAddressTitle", "()Lcom/yandex/go/address/models/FavoriteAddress$FavoriteTitle;", "getAddressTitle$annotations", "addressSubtitle", "c", "getAddressSubtitle$annotations", "comment", "b1", "getComment$annotations", "commentCourier", "n0", "getCommentCourier$annotations", "doorPhoneNumber", "f", "getDoorPhoneNumber$annotations", "floorNumber", "H1", "getFloorNumber$annotations", "name", "getName", "getName$annotations", "house", CoreConstants.PushMessage.SERVICE_TYPE, "getHouse$annotations", "quartersNumber", "e2", "getQuartersNumber$annotations", "porchNumber", "J1", "getPorchNumber$annotations", "type", "getType", "getType$annotations", "imageTag", "k", "getImageTag$annotations", "emoji", "g", "getEmoji$annotations", LaunchBrowserActivity.KEY_URI, "getUri", "getUri$annotations", "log", "c2", "getLog$annotations", "Companion", "FavoriteTitle", "$serializer", "com/yandex/go/address/models/a", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FavoriteAddress implements Serializable {
    public static final a Companion = new a();
    public static final i3y[] a;
    private final FavoriteTitle addressSubtitle;
    private final FavoriteTitle addressTitle;
    private final String comment;
    private final String commentCourier;
    private final FavoriteAddressDatumType datumType;
    private final String doorPhoneNumber;
    private final String emoji;
    private final String floorNumber;
    private final String fullText;
    private final String house;
    private final String id;
    private final String imageTag;
    private final String log;
    private final String name;
    private final PlaceType placeType;
    private final zzs point;
    private final String porchNumber;
    private final String quartersNumber;
    private final String shortText;
    private final String type;
    private final String uri;
    private final int version;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        a = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new d6p(25)), kotlin.a.b(lazyThreadSafetyMode, new d6p(26)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ FavoriteAddress(int i, String str, int i2, String str2, String str3, zzs zzsVar, PlaceType placeType, FavoriteAddressDatumType favoriteAddressDatumType, FavoriteTitle favoriteTitle, FavoriteTitle favoriteTitle2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        int i3 = 0;
        if ((i & 2) == 0) {
            this.version = 0;
        } else {
            this.version = i2;
        }
        if ((i & 4) == 0) {
            this.shortText = "";
        } else {
            this.shortText = str2;
        }
        if ((i & 8) == 0) {
            this.fullText = "";
        } else {
            this.fullText = str3;
        }
        if ((i & 16) == 0) {
            this.point = zzs.f;
        } else {
            this.point = zzsVar;
        }
        if ((i & 32) == 0) {
            this.placeType = null;
        } else {
            this.placeType = placeType;
        }
        if ((i & 64) == 0) {
            this.datumType = null;
        } else {
            this.datumType = favoriteAddressDatumType;
        }
        if ((i & 128) == 0) {
            this.addressTitle = new FavoriteTitle(i3);
        } else {
            this.addressTitle = favoriteTitle;
        }
        if ((i & 256) == 0) {
            this.addressSubtitle = null;
        } else {
            this.addressSubtitle = favoriteTitle2;
        }
        if ((i & 512) == 0) {
            this.comment = null;
        } else {
            this.comment = str4;
        }
        if ((i & 1024) == 0) {
            this.commentCourier = null;
        } else {
            this.commentCourier = str5;
        }
        if ((i & 2048) == 0) {
            this.doorPhoneNumber = null;
        } else {
            this.doorPhoneNumber = str6;
        }
        if ((i & 4096) == 0) {
            this.floorNumber = null;
        } else {
            this.floorNumber = str7;
        }
        if ((i & 8192) == 0) {
            this.name = null;
        } else {
            this.name = str8;
        }
        if ((i & 16384) == 0) {
            this.house = null;
        } else {
            this.house = str9;
        }
        if ((32768 & i) == 0) {
            this.quartersNumber = null;
        } else {
            this.quartersNumber = str10;
        }
        if ((65536 & i) == 0) {
            this.porchNumber = null;
        } else {
            this.porchNumber = str11;
        }
        if ((131072 & i) == 0) {
            this.type = null;
        } else {
            this.type = str12;
        }
        if ((262144 & i) == 0) {
            this.imageTag = "";
        } else {
            this.imageTag = str13;
        }
        if ((524288 & i) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str14;
        }
        if ((1048576 & i) == 0) {
            this.uri = null;
        } else {
            this.uri = str15;
        }
        if ((i & 2097152) == 0) {
            this.log = null;
        } else {
            this.log = str16;
        }
    }

    public static FavoriteAddress b(FavoriteAddress favoriteAddress, String str, int i, PlaceType placeType, FavoriteAddressDatumType favoriteAddressDatumType, String str2, int i2) {
        String str3 = (i2 & 1) != 0 ? favoriteAddress.id : str;
        int i3 = (i2 & 2) != 0 ? favoriteAddress.version : i;
        String str4 = favoriteAddress.shortText;
        String str5 = favoriteAddress.fullText;
        zzs zzsVar = favoriteAddress.point;
        PlaceType placeType2 = (i2 & 32) != 0 ? favoriteAddress.placeType : placeType;
        FavoriteAddressDatumType favoriteAddressDatumType2 = (i2 & 64) != 0 ? favoriteAddress.datumType : favoriteAddressDatumType;
        FavoriteTitle favoriteTitle = favoriteAddress.addressTitle;
        FavoriteTitle favoriteTitle2 = favoriteAddress.addressSubtitle;
        String str6 = favoriteAddress.comment;
        String str7 = favoriteAddress.commentCourier;
        String str8 = favoriteAddress.doorPhoneNumber;
        String str9 = favoriteAddress.floorNumber;
        String str10 = favoriteAddress.name;
        String str11 = favoriteAddress.house;
        String str12 = favoriteAddress.quartersNumber;
        String str13 = favoriteAddress.porchNumber;
        String str14 = favoriteAddress.type;
        String str15 = (i2 & 262144) != 0 ? favoriteAddress.imageTag : str2;
        String str16 = favoriteAddress.emoji;
        String str17 = favoriteAddress.uri;
        String str18 = favoriteAddress.log;
        favoriteAddress.getClass();
        return new FavoriteAddress(str3, i3, str4, str5, zzsVar, placeType2, favoriteAddressDatumType2, favoriteTitle, favoriteTitle2, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public static final /* synthetic */ void r(FavoriteAddress favoriteAddress, yjd yjdVar, SerialDescriptor serialDescriptor) {
        int i = 0;
        if (yjdVar.F() || !jl40.l(favoriteAddress.id, "")) {
            yjdVar.o(serialDescriptor, 0, favoriteAddress.id);
        }
        if (yjdVar.F() || favoriteAddress.version != 0) {
            yjdVar.A(1, favoriteAddress.version, serialDescriptor);
        }
        if (yjdVar.F() || !jl40.l(favoriteAddress.shortText, "")) {
            yjdVar.o(serialDescriptor, 2, favoriteAddress.shortText);
        }
        if (yjdVar.F() || !jl40.l(favoriteAddress.fullText, "")) {
            yjdVar.o(serialDescriptor, 3, favoriteAddress.fullText);
        }
        if (yjdVar.F() || !jl40.l(favoriteAddress.point, zzs.f)) {
            yjdVar.e(serialDescriptor, 4, b0t.a, favoriteAddress.point);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = a;
        if (F || favoriteAddress.placeType != null) {
            yjdVar.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), favoriteAddress.placeType);
        }
        if (yjdVar.F() || favoriteAddress.datumType != null) {
            yjdVar.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), favoriteAddress.datumType);
        }
        if (yjdVar.F() || !jl40.l(favoriteAddress.addressTitle, new FavoriteTitle(i))) {
            yjdVar.e(serialDescriptor, 7, FavoriteAddress$FavoriteTitle$$serializer.INSTANCE, favoriteAddress.addressTitle);
        }
        if (yjdVar.F() || favoriteAddress.addressSubtitle != null) {
            yjdVar.g(serialDescriptor, 8, FavoriteAddress$FavoriteTitle$$serializer.INSTANCE, favoriteAddress.addressSubtitle);
        }
        if (yjdVar.F() || favoriteAddress.comment != null) {
            yjdVar.g(serialDescriptor, 9, auu0.a, favoriteAddress.comment);
        }
        if (yjdVar.F() || favoriteAddress.commentCourier != null) {
            yjdVar.g(serialDescriptor, 10, auu0.a, favoriteAddress.commentCourier);
        }
        if (yjdVar.F() || favoriteAddress.doorPhoneNumber != null) {
            yjdVar.g(serialDescriptor, 11, auu0.a, favoriteAddress.doorPhoneNumber);
        }
        if (yjdVar.F() || favoriteAddress.floorNumber != null) {
            yjdVar.g(serialDescriptor, 12, auu0.a, favoriteAddress.floorNumber);
        }
        if (yjdVar.F() || favoriteAddress.name != null) {
            yjdVar.g(serialDescriptor, 13, auu0.a, favoriteAddress.name);
        }
        if (yjdVar.F() || favoriteAddress.house != null) {
            yjdVar.g(serialDescriptor, 14, auu0.a, favoriteAddress.house);
        }
        if (yjdVar.F() || favoriteAddress.quartersNumber != null) {
            yjdVar.g(serialDescriptor, 15, auu0.a, favoriteAddress.quartersNumber);
        }
        if (yjdVar.F() || favoriteAddress.porchNumber != null) {
            yjdVar.g(serialDescriptor, 16, auu0.a, favoriteAddress.porchNumber);
        }
        if (yjdVar.F() || favoriteAddress.type != null) {
            yjdVar.g(serialDescriptor, 17, auu0.a, favoriteAddress.type);
        }
        if (yjdVar.F() || !jl40.l(favoriteAddress.imageTag, "")) {
            yjdVar.o(serialDescriptor, 18, favoriteAddress.imageTag);
        }
        if (yjdVar.F() || favoriteAddress.emoji != null) {
            yjdVar.g(serialDescriptor, 19, auu0.a, favoriteAddress.emoji);
        }
        if (yjdVar.F() || favoriteAddress.uri != null) {
            yjdVar.g(serialDescriptor, 20, auu0.a, favoriteAddress.uri);
        }
        if (!yjdVar.F() && favoriteAddress.log == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 21, auu0.a, favoriteAddress.log);
    }

    /* renamed from: D1, reason: from getter */
    public final String getShortText() {
        return this.shortText;
    }

    /* renamed from: F0, reason: from getter */
    public final PlaceType getPlaceType() {
        return this.placeType;
    }

    /* renamed from: H1, reason: from getter */
    public final String getFloorNumber() {
        return this.floorNumber;
    }

    /* renamed from: J1, reason: from getter */
    public final String getPorchNumber() {
        return this.porchNumber;
    }

    /* renamed from: P0, reason: from getter */
    public final FavoriteAddressDatumType getDatumType() {
        return this.datumType;
    }

    /* renamed from: b1, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: c, reason: from getter */
    public final FavoriteTitle getAddressSubtitle() {
        return this.addressSubtitle;
    }

    /* renamed from: c2, reason: from getter */
    public final String getLog() {
        return this.log;
    }

    /* renamed from: e2, reason: from getter */
    public final String getQuartersNumber() {
        return this.quartersNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteAddress)) {
            return false;
        }
        FavoriteAddress favoriteAddress = (FavoriteAddress) obj;
        return jl40.l(this.id, favoriteAddress.id) && this.version == favoriteAddress.version && jl40.l(this.shortText, favoriteAddress.shortText) && jl40.l(this.fullText, favoriteAddress.fullText) && jl40.l(this.point, favoriteAddress.point) && this.placeType == favoriteAddress.placeType && this.datumType == favoriteAddress.datumType && jl40.l(this.addressTitle, favoriteAddress.addressTitle) && jl40.l(this.addressSubtitle, favoriteAddress.addressSubtitle) && jl40.l(this.comment, favoriteAddress.comment) && jl40.l(this.commentCourier, favoriteAddress.commentCourier) && jl40.l(this.doorPhoneNumber, favoriteAddress.doorPhoneNumber) && jl40.l(this.floorNumber, favoriteAddress.floorNumber) && jl40.l(this.name, favoriteAddress.name) && jl40.l(this.house, favoriteAddress.house) && jl40.l(this.quartersNumber, favoriteAddress.quartersNumber) && jl40.l(this.porchNumber, favoriteAddress.porchNumber) && jl40.l(this.type, favoriteAddress.type) && jl40.l(this.imageTag, favoriteAddress.imageTag) && jl40.l(this.emoji, favoriteAddress.emoji) && jl40.l(this.uri, favoriteAddress.uri) && jl40.l(this.log, favoriteAddress.log);
    }

    /* renamed from: f, reason: from getter */
    public final String getDoorPhoneNumber() {
        return this.doorPhoneNumber;
    }

    /* renamed from: g, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUri() {
        return this.uri;
    }

    /* renamed from: h, reason: from getter */
    public final String getFullText() {
        return this.fullText;
    }

    public final int hashCode() {
        int b = nnm.b(this.point, unr0.b(unr0.b(oyr.b(this.version, this.id.hashCode() * 31, 31), 31, this.shortText), 31, this.fullText), 31);
        PlaceType placeType = this.placeType;
        int hashCode = (b + (placeType == null ? 0 : placeType.hashCode())) * 31;
        FavoriteAddressDatumType favoriteAddressDatumType = this.datumType;
        int b2 = unr0.b((hashCode + (favoriteAddressDatumType == null ? 0 : favoriteAddressDatumType.hashCode())) * 31, 31, this.addressTitle.a);
        FavoriteTitle favoriteTitle = this.addressSubtitle;
        int hashCode2 = (b2 + (favoriteTitle == null ? 0 : favoriteTitle.a.hashCode())) * 31;
        String str = this.comment;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.commentCourier;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.doorPhoneNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.floorNumber;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.house;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.quartersNumber;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.porchNumber;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.type;
        int b3 = unr0.b((hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.imageTag);
        String str10 = this.emoji;
        int hashCode11 = (b3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.uri;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.log;
        return hashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getHouse() {
        return this.house;
    }

    /* renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: k, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: l, reason: from getter */
    public final zzs getPoint() {
        return this.point;
    }

    /* renamed from: m, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final boolean n() {
        return this.id.length() > 0;
    }

    /* renamed from: n0, reason: from getter */
    public final String getCommentCourier() {
        return this.commentCourier;
    }

    public final String p() {
        FavoriteTitle favoriteTitle = this.addressSubtitle;
        if (favoriteTitle != null) {
            return favoriteTitle.a;
        }
        return null;
    }

    public final String q() {
        return this.addressTitle.a;
    }

    public final String toString() {
        String str = this.id;
        int i = this.version;
        String str2 = this.shortText;
        String str3 = this.fullText;
        zzs zzsVar = this.point;
        PlaceType placeType = this.placeType;
        FavoriteAddressDatumType favoriteAddressDatumType = this.datumType;
        FavoriteTitle favoriteTitle = this.addressTitle;
        FavoriteTitle favoriteTitle2 = this.addressSubtitle;
        String str4 = this.comment;
        String str5 = this.commentCourier;
        String str6 = this.doorPhoneNumber;
        String str7 = this.floorNumber;
        String str8 = this.name;
        String str9 = this.house;
        String str10 = this.quartersNumber;
        String str11 = this.porchNumber;
        String str12 = this.type;
        String str13 = this.imageTag;
        String str14 = this.emoji;
        String str15 = this.uri;
        String str16 = this.log;
        StringBuilder u = b64.u(i, "FavoriteAddress(id=", str, ", version=", ", shortText=");
        g8e.D(u, str2, ", fullText=", str3, ", point=");
        u.append(zzsVar);
        u.append(", placeType=");
        u.append(placeType);
        u.append(", datumType=");
        u.append(favoriteAddressDatumType);
        u.append(", addressTitle=");
        u.append(favoriteTitle);
        u.append(", addressSubtitle=");
        u.append(favoriteTitle2);
        u.append(", comment=");
        u.append(str4);
        u.append(", commentCourier=");
        g8e.D(u, str5, ", doorPhoneNumber=", str6, ", floorNumber=");
        g8e.D(u, str7, ", name=", str8, ", house=");
        g8e.D(u, str9, ", quartersNumber=", str10, ", porchNumber=");
        g8e.D(u, str11, ", type=", str12, ", imageTag=");
        g8e.D(u, str13, ", emoji=", str14, ", uri=");
        return g8e.r(u, str15, ", log=", str16, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/address/models/FavoriteAddress$FavoriteTitle;", "", "Companion", "$serializer", "com/yandex/go/address/models/b", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class FavoriteTitle {
        public static final b Companion = new b();
        public final String a;

        public /* synthetic */ FavoriteTitle(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoriteTitle) && jl40.l(this.a, ((FavoriteTitle) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("FavoriteTitle(text=", this.a, Extension.C_BRAKE);
        }

        public FavoriteTitle() {
            this(0);
        }

        public FavoriteTitle(String str) {
            this.a = str;
        }

        public /* synthetic */ FavoriteTitle(int i) {
            this("");
        }
    }

    public FavoriteAddress() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303);
    }

    public FavoriteAddress(String str, int i, String str2, String str3, zzs zzsVar, PlaceType placeType, FavoriteAddressDatumType favoriteAddressDatumType, FavoriteTitle favoriteTitle, FavoriteTitle favoriteTitle2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.id = str;
        this.version = i;
        this.shortText = str2;
        this.fullText = str3;
        this.point = zzsVar;
        this.placeType = placeType;
        this.datumType = favoriteAddressDatumType;
        this.addressTitle = favoriteTitle;
        this.addressSubtitle = favoriteTitle2;
        this.comment = str4;
        this.commentCourier = str5;
        this.doorPhoneNumber = str6;
        this.floorNumber = str7;
        this.name = str8;
        this.house = str9;
        this.quartersNumber = str10;
        this.porchNumber = str11;
        this.type = str12;
        this.imageTag = str13;
        this.emoji = str14;
        this.uri = str15;
        this.log = str16;
    }

    public /* synthetic */ FavoriteAddress(String str, String str2, String str3, zzs zzsVar, PlaceType placeType, FavoriteAddressDatumType favoriteAddressDatumType, FavoriteTitle favoriteTitle, FavoriteTitle favoriteTitle2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        this((i & 1) != 0 ? "" : str, 0, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? zzs.f : zzsVar, (i & 32) != 0 ? null : placeType, (i & 64) != 0 ? null : favoriteAddressDatumType, (i & 128) != 0 ? new FavoriteTitle(0) : favoriteTitle, (i & 256) != 0 ? null : favoriteTitle2, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, null, "", null, (1048576 & i) != 0 ? null : str12, (i & 2097152) != 0 ? null : str13);
    }
}
