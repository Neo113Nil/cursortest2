package com.yandex.passport.internal.account;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.i;
import com.yandex.passport.internal.entities.Partitions;
import com.yandex.passport.internal.stash.Stash;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import defpackage.wwg;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u0002:\u0002\u008a\u0001Bû\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020\t\u0012\u0006\u0010%\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0017\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0017\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u001d\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020/¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b:\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b;\u00109J\u0010\u0010<\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b<\u0010)J\u0012\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b=\u00109J\u0010\u0010>\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b>\u0010)J\u0012\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b?\u00109J\u0010\u0010@\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b@\u0010)J\u0010\u0010A\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bA\u0010)J\u0010\u0010B\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bH\u0010)J\u0012\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bI\u00109J\u0012\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bJ\u00109J\u0012\u0010K\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bM\u00109J\u0010\u0010N\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bP\u00109J\u0010\u0010Q\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bQ\u0010)J\u0010\u0010R\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bR\u0010)J\u0010\u0010S\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bS\u0010)J\u0010\u0010T\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bT\u0010)J\u0010\u0010U\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bU\u0010)J\u0010\u0010V\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bV\u0010)J\u0010\u0010W\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bW\u0010)J¼\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\tHÆ\u0001¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bZ\u00109J\u0010\u0010[\u001a\u00020/HÖ\u0001¢\u0006\u0004\b[\u00105J\u001a\u0010^\u001a\u00020\t2\b\u0010]\u001a\u0004\u0018\u00010\\HÖ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b`\u00109R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010a\u001a\u0004\bb\u00107R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010c\u001a\u0004\bd\u00109R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010c\u001a\u0004\be\u00109R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010c\u001a\u0004\bf\u00109R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010g\u001a\u0004\b\n\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010c\u001a\u0004\bh\u00109R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010g\u001a\u0004\b\f\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010c\u001a\u0004\bi\u00109R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010g\u001a\u0004\b\u000e\u0010)R\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010g\u001a\u0004\b\u000f\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010j\u001a\u0004\bk\u0010CR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010l\u001a\u0004\bm\u0010ER\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010n\u001a\u0004\bo\u0010GR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010cR\u001a\u0010\u0017\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010g\u001a\u0004\bp\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010c\u001a\u0004\bq\u00109R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\br\u00109R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010s\u001a\u0004\bt\u0010LR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010c\u001a\u0004\bu\u00109R\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010v\u001a\u0004\bw\u0010OR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010c\u001a\u0004\bx\u00109R\u001a\u0010 \u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010g\u001a\u0004\b \u0010)R\u001a\u0010!\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010g\u001a\u0004\b!\u0010)R\u001a\u0010\"\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010g\u001a\u0004\b\"\u0010)R\u001a\u0010#\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010g\u001a\u0004\b#\u0010)R\u001a\u0010$\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010g\u001a\u0004\b$\u0010)R\u001a\u0010%\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010g\u001a\u0004\b%\u0010)R\u001a\u0010&\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010g\u001a\u0004\by\u0010)R\u0016\u0010}\u001a\u0004\u0018\u00010z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u001b\u0010~\u001a\u00020\t8VX\u0097\u0004¢\u0006\r\u0012\u0005\b\u007f\u0010\u0080\u0001\u001a\u0004\b~\u0010)R\u001e\u0010\u0081\u0001\u001a\u00020\t8VX\u0097\u0004¢\u0006\u000f\u0012\u0006\b\u0082\u0001\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010)R\u001e\u0010\u0083\u0001\u001a\u00020\t8VX\u0097\u0004¢\u0006\u000f\u0012\u0006\b\u0084\u0001\u0010\u0080\u0001\u001a\u0005\b\u0083\u0001\u0010)R\u001e\u0010\u0085\u0001\u001a\u00020\t8VX\u0097\u0004¢\u0006\u000f\u0012\u0006\b\u0086\u0001\u0010\u0080\u0001\u001a\u0005\b\u0085\u0001\u0010)R\u001e\u0010\u0087\u0001\u001a\u00020\t8VX\u0097\u0004¢\u0006\u000f\u0012\u0006\b\u0088\u0001\u0010\u0080\u0001\u001a\u0005\b\u0087\u0001\u0010)¨\u0006\u008b\u0001"}, d2 = {"Lcom/yandex/passport/internal/account/PassportAccountImpl;", "Lcom/yandex/passport/api/i;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", "primaryDisplayName", "secondaryDisplayName", "avatarUrl", "", "isAvatarEmpty", "nativeDefaultEmail", "isYandexoid", "yandexoidLogin", "isBetaTester", "isAuthorized", "Lcom/yandex/passport/internal/stash/Stash;", "stash", "Landroid/accounts/Account;", "androidAccount", "Lcom/yandex/passport/api/PassportAccountType;", "accountType", "socialProviderCodeValue", "hasPlus", "firstName", "lastName", "Ljava/util/Date;", "birthday", "publicId", "Lcom/yandex/passport/internal/entities/Partitions;", "partitions", "machineReadableLogin", "is2faEnabled", "isSms2faEnabled", "isRfc2faEnabled", "isPictureLoginSupported", "isXtokenTrusted", "isBrowserAccount", "hasWebAuthNCredential", "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZLcom/yandex/passport/internal/stash/Stash;Landroid/accounts/Account;Lcom/yandex/passport/api/PassportAccountType;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/yandex/passport/internal/entities/Partitions;Ljava/lang/String;ZZZZZZZ)V", "()Z", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportUidImpl;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/yandex/passport/internal/stash/Stash;", "component12", "()Landroid/accounts/Account;", "component13", "()Lcom/yandex/passport/api/PassportAccountType;", "component15", "component16", "component17", "component18", "()Ljava/util/Date;", "component19", "component20", "()Lcom/yandex/passport/internal/entities/Partitions;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZLcom/yandex/passport/internal/stash/Stash;Landroid/accounts/Account;Lcom/yandex/passport/api/PassportAccountType;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/yandex/passport/internal/entities/Partitions;Ljava/lang/String;ZZZZZZZ)Lcom/yandex/passport/internal/account/PassportAccountImpl;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component14", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getPrimaryDisplayName", "getSecondaryDisplayName", "getAvatarUrl", "Z", "getNativeDefaultEmail", "getYandexoidLogin", "Lcom/yandex/passport/internal/stash/Stash;", "getStash", "Landroid/accounts/Account;", "getAndroidAccount", "Lcom/yandex/passport/api/PassportAccountType;", "getAccountType", "getHasPlus", "getFirstName", "getLastName", "Ljava/util/Date;", "getBirthday", "getPublicId", "Lcom/yandex/passport/internal/entities/Partitions;", "getPartitions", "getMachineReadableLogin", "getHasWebAuthNCredential", "Lcom/yandex/passport/api/PassportSocialProviderCode;", "getSocialProviderCode", "()Lcom/yandex/passport/api/PassportSocialProviderCode;", "socialProviderCode", "isMailish", "isMailish$annotations", "()V", "isPhonish", "isPhonish$annotations", "isSocial", "isSocial$annotations", "isPdd", "isPdd$annotations", "isLite", "isLite$annotations", "Companion", "com/yandex/passport/internal/account/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportAccountImpl implements i, Parcelable {
    public static final int $stable = 8;
    private final PassportAccountType accountType;
    private final Account androidAccount;
    private final String avatarUrl;
    private final Date birthday;
    private final String firstName;
    private final boolean hasPlus;
    private final boolean hasWebAuthNCredential;
    private final boolean is2faEnabled;
    private final boolean isAuthorized;
    private final boolean isAvatarEmpty;
    private final boolean isBetaTester;
    private final boolean isBrowserAccount;
    private final boolean isPictureLoginSupported;
    private final boolean isRfc2faEnabled;
    private final boolean isSms2faEnabled;
    private final boolean isXtokenTrusted;
    private final boolean isYandexoid;
    private final String lastName;
    private final String machineReadableLogin;
    private final String nativeDefaultEmail;
    private final Partitions partitions;
    private final String primaryDisplayName;
    private final String publicId;
    private final String secondaryDisplayName;
    private final String socialProviderCodeValue;
    private final Stash stash;
    private final PassportUidImpl uid;
    private final String yandexoidLogin;
    public static final e Companion = new e();
    public static final Parcelable.Creator<PassportAccountImpl> CREATOR = new Creator();

    public PassportAccountImpl(PassportUidImpl passportUidImpl, String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, boolean z3, boolean z4, Stash stash, Account account, PassportAccountType passportAccountType, String str6, boolean z5, String str7, String str8, Date date, String str9, Partitions partitions, String str10, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.uid = passportUidImpl;
        this.primaryDisplayName = str;
        this.secondaryDisplayName = str2;
        this.avatarUrl = str3;
        this.isAvatarEmpty = z;
        this.nativeDefaultEmail = str4;
        this.isYandexoid = z2;
        this.yandexoidLogin = str5;
        this.isBetaTester = z3;
        this.isAuthorized = z4;
        this.stash = stash;
        this.androidAccount = account;
        this.accountType = passportAccountType;
        this.socialProviderCodeValue = str6;
        this.hasPlus = z5;
        this.firstName = str7;
        this.lastName = str8;
        this.birthday = date;
        this.publicId = str9;
        this.partitions = partitions;
        this.machineReadableLogin = str10;
        this.is2faEnabled = z6;
        this.isSms2faEnabled = z7;
        this.isRfc2faEnabled = z8;
        this.isPictureLoginSupported = z9;
        this.isXtokenTrusted = z10;
        this.isBrowserAccount = z11;
        this.hasWebAuthNCredential = z12;
    }

    /* renamed from: component14, reason: from getter */
    private final String getSocialProviderCodeValue() {
        return this.socialProviderCodeValue;
    }

    public static /* synthetic */ PassportAccountImpl copy$default(PassportAccountImpl passportAccountImpl, PassportUidImpl passportUidImpl, String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, boolean z3, boolean z4, Stash stash, Account account, PassportAccountType passportAccountType, String str6, boolean z5, String str7, String str8, Date date, String str9, Partitions partitions, String str10, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, Object obj) {
        boolean z13;
        boolean z14;
        PassportUidImpl passportUidImpl2 = (i & 1) != 0 ? passportAccountImpl.uid : passportUidImpl;
        String str11 = (i & 2) != 0 ? passportAccountImpl.primaryDisplayName : str;
        String str12 = (i & 4) != 0 ? passportAccountImpl.secondaryDisplayName : str2;
        String str13 = (i & 8) != 0 ? passportAccountImpl.avatarUrl : str3;
        boolean z15 = (i & 16) != 0 ? passportAccountImpl.isAvatarEmpty : z;
        String str14 = (i & 32) != 0 ? passportAccountImpl.nativeDefaultEmail : str4;
        boolean z16 = (i & 64) != 0 ? passportAccountImpl.isYandexoid : z2;
        String str15 = (i & 128) != 0 ? passportAccountImpl.yandexoidLogin : str5;
        boolean z17 = (i & 256) != 0 ? passportAccountImpl.isBetaTester : z3;
        boolean z18 = (i & 512) != 0 ? passportAccountImpl.isAuthorized : z4;
        Stash stash2 = (i & 1024) != 0 ? passportAccountImpl.stash : stash;
        Account account2 = (i & 2048) != 0 ? passportAccountImpl.androidAccount : account;
        PassportAccountType passportAccountType2 = (i & 4096) != 0 ? passportAccountImpl.accountType : passportAccountType;
        String str16 = (i & 8192) != 0 ? passportAccountImpl.socialProviderCodeValue : str6;
        PassportUidImpl passportUidImpl3 = passportUidImpl2;
        boolean z19 = (i & 16384) != 0 ? passportAccountImpl.hasPlus : z5;
        String str17 = (i & 32768) != 0 ? passportAccountImpl.firstName : str7;
        String str18 = (i & 65536) != 0 ? passportAccountImpl.lastName : str8;
        Date date2 = (i & 131072) != 0 ? passportAccountImpl.birthday : date;
        String str19 = (i & 262144) != 0 ? passportAccountImpl.publicId : str9;
        Partitions partitions2 = (i & 524288) != 0 ? passportAccountImpl.partitions : partitions;
        String str20 = (i & 1048576) != 0 ? passportAccountImpl.machineReadableLogin : str10;
        boolean z20 = (i & 2097152) != 0 ? passportAccountImpl.is2faEnabled : z6;
        boolean z21 = (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? passportAccountImpl.isSms2faEnabled : z7;
        boolean z22 = (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? passportAccountImpl.isRfc2faEnabled : z8;
        boolean z23 = (i & 16777216) != 0 ? passportAccountImpl.isPictureLoginSupported : z9;
        boolean z24 = (i & SelfTester_JCP.DECRYPT_CFB) != 0 ? passportAccountImpl.isXtokenTrusted : z10;
        boolean z25 = (i & SelfTester_JCP.DECRYPT_CBC) != 0 ? passportAccountImpl.isBrowserAccount : z11;
        if ((i & SelfTester_JCP.DECRYPT_CNT) != 0) {
            z14 = z25;
            z13 = passportAccountImpl.hasWebAuthNCredential;
        } else {
            z13 = z12;
            z14 = z25;
        }
        return passportAccountImpl.copy(passportUidImpl3, str11, str12, str13, z15, str14, z16, str15, z17, z18, stash2, account2, passportAccountType2, str16, z19, str17, str18, date2, str19, partitions2, str20, z20, z21, z22, z23, z24, z14, z13);
    }

    @jxi
    public static /* synthetic */ void isLite$annotations() {
    }

    @jxi
    public static /* synthetic */ void isMailish$annotations() {
    }

    @jxi
    public static /* synthetic */ void isPdd$annotations() {
    }

    @jxi
    public static /* synthetic */ void isPhonish$annotations() {
    }

    @jxi
    public static /* synthetic */ void isSocial$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    /* renamed from: component11, reason: from getter */
    public final Stash getStash() {
        return this.stash;
    }

    /* renamed from: component12, reason: from getter */
    public final Account getAndroidAccount() {
        return this.androidAccount;
    }

    /* renamed from: component13, reason: from getter */
    public final PassportAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getHasPlus() {
        return this.hasPlus;
    }

    /* renamed from: component16, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component17, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component18, reason: from getter */
    public final Date getBirthday() {
        return this.birthday;
    }

    /* renamed from: component19, reason: from getter */
    public final String getPublicId() {
        return this.publicId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryDisplayName() {
        return this.primaryDisplayName;
    }

    /* renamed from: component20, reason: from getter */
    public final Partitions getPartitions() {
        return this.partitions;
    }

    /* renamed from: component21, reason: from getter */
    public final String getMachineReadableLogin() {
        return this.machineReadableLogin;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIs2faEnabled() {
        return this.is2faEnabled;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsSms2faEnabled() {
        return this.isSms2faEnabled;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsRfc2faEnabled() {
        return this.isRfc2faEnabled;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsPictureLoginSupported() {
        return this.isPictureLoginSupported;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsXtokenTrusted() {
        return this.isXtokenTrusted;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsBrowserAccount() {
        return this.isBrowserAccount;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getHasWebAuthNCredential() {
        return this.hasWebAuthNCredential;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryDisplayName() {
        return this.secondaryDisplayName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAvatarEmpty() {
        return this.isAvatarEmpty;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNativeDefaultEmail() {
        return this.nativeDefaultEmail;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsYandexoid() {
        return this.isYandexoid;
    }

    /* renamed from: component8, reason: from getter */
    public final String getYandexoidLogin() {
        return this.yandexoidLogin;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsBetaTester() {
        return this.isBetaTester;
    }

    public final PassportAccountImpl copy(PassportUidImpl uid, String primaryDisplayName, String secondaryDisplayName, String avatarUrl, boolean isAvatarEmpty, String nativeDefaultEmail, boolean isYandexoid, String yandexoidLogin, boolean isBetaTester, boolean isAuthorized, Stash stash, Account androidAccount, PassportAccountType accountType, String socialProviderCodeValue, boolean hasPlus, String firstName, String lastName, Date birthday, String publicId, Partitions partitions, String machineReadableLogin, boolean is2faEnabled, boolean isSms2faEnabled, boolean isRfc2faEnabled, boolean isPictureLoginSupported, boolean isXtokenTrusted, boolean isBrowserAccount, boolean hasWebAuthNCredential) {
        return new PassportAccountImpl(uid, primaryDisplayName, secondaryDisplayName, avatarUrl, isAvatarEmpty, nativeDefaultEmail, isYandexoid, yandexoidLogin, isBetaTester, isAuthorized, stash, androidAccount, accountType, socialProviderCodeValue, hasPlus, firstName, lastName, birthday, publicId, partitions, machineReadableLogin, is2faEnabled, isSms2faEnabled, isRfc2faEnabled, isPictureLoginSupported, isXtokenTrusted, isBrowserAccount, hasWebAuthNCredential);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportAccountImpl)) {
            return false;
        }
        PassportAccountImpl passportAccountImpl = (PassportAccountImpl) other;
        return jl40.l(this.uid, passportAccountImpl.uid) && jl40.l(this.primaryDisplayName, passportAccountImpl.primaryDisplayName) && jl40.l(this.secondaryDisplayName, passportAccountImpl.secondaryDisplayName) && jl40.l(this.avatarUrl, passportAccountImpl.avatarUrl) && this.isAvatarEmpty == passportAccountImpl.isAvatarEmpty && jl40.l(this.nativeDefaultEmail, passportAccountImpl.nativeDefaultEmail) && this.isYandexoid == passportAccountImpl.isYandexoid && jl40.l(this.yandexoidLogin, passportAccountImpl.yandexoidLogin) && this.isBetaTester == passportAccountImpl.isBetaTester && this.isAuthorized == passportAccountImpl.isAuthorized && jl40.l(this.stash, passportAccountImpl.stash) && jl40.l(this.androidAccount, passportAccountImpl.androidAccount) && this.accountType == passportAccountImpl.accountType && jl40.l(this.socialProviderCodeValue, passportAccountImpl.socialProviderCodeValue) && this.hasPlus == passportAccountImpl.hasPlus && jl40.l(this.firstName, passportAccountImpl.firstName) && jl40.l(this.lastName, passportAccountImpl.lastName) && jl40.l(this.birthday, passportAccountImpl.birthday) && jl40.l(this.publicId, passportAccountImpl.publicId) && jl40.l(this.partitions, passportAccountImpl.partitions) && jl40.l(this.machineReadableLogin, passportAccountImpl.machineReadableLogin) && this.is2faEnabled == passportAccountImpl.is2faEnabled && this.isSms2faEnabled == passportAccountImpl.isSms2faEnabled && this.isRfc2faEnabled == passportAccountImpl.isRfc2faEnabled && this.isPictureLoginSupported == passportAccountImpl.isPictureLoginSupported && this.isXtokenTrusted == passportAccountImpl.isXtokenTrusted && this.isBrowserAccount == passportAccountImpl.isBrowserAccount && this.hasWebAuthNCredential == passportAccountImpl.hasWebAuthNCredential;
    }

    @Override // com.yandex.passport.api.i
    public PassportAccountType getAccountType() {
        return this.accountType;
    }

    public Account getAndroidAccount() {
        return this.androidAccount;
    }

    @Override // com.yandex.passport.api.i
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    @Override // com.yandex.passport.api.i
    public String getFirstName() {
        return this.firstName;
    }

    @Override // com.yandex.passport.api.i
    public boolean getHasPlus() {
        return this.hasPlus;
    }

    public boolean getHasWebAuthNCredential() {
        return this.hasWebAuthNCredential;
    }

    @Override // com.yandex.passport.api.i
    public String getLastName() {
        return this.lastName;
    }

    public String getMachineReadableLogin() {
        return this.machineReadableLogin;
    }

    @Override // com.yandex.passport.api.i
    public String getNativeDefaultEmail() {
        return this.nativeDefaultEmail;
    }

    @Override // com.yandex.passport.api.i
    public String getPrimaryDisplayName() {
        return this.primaryDisplayName;
    }

    public String getPublicId() {
        return this.publicId;
    }

    @Override // com.yandex.passport.api.i
    public String getSecondaryDisplayName() {
        return this.secondaryDisplayName;
    }

    public PassportSocialProviderCode getSocialProviderCode() {
        String str = this.socialProviderCodeValue;
        PassportSocialProviderCode passportSocialProviderCode = null;
        if (str != null) {
            PassportSocialProviderCode[] values = PassportSocialProviderCode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                PassportSocialProviderCode passportSocialProviderCode2 = values[i];
                if (jl40.l(passportSocialProviderCode2.getCodeString(), str)) {
                    passportSocialProviderCode = passportSocialProviderCode2;
                    break;
                }
                i++;
            }
            if (passportSocialProviderCode == null) {
                return PassportSocialProviderCode.OTHER;
            }
        }
        return passportSocialProviderCode;
    }

    @Override // com.yandex.passport.api.i
    public String getYandexoidLogin() {
        return this.yandexoidLogin;
    }

    @jxi
    public boolean hasPlus() {
        return getHasPlus();
    }

    public int hashCode() {
        int b = unr0.b(this.uid.hashCode() * 31, 31, this.primaryDisplayName);
        String str = this.secondaryDisplayName;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int e = unr0.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isAvatarEmpty);
        String str3 = this.nativeDefaultEmail;
        int e2 = unr0.e((e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isYandexoid);
        String str4 = this.yandexoidLogin;
        int hashCode2 = (this.accountType.hashCode() + ((this.androidAccount.hashCode() + ((this.stash.hashCode() + unr0.e(unr0.e((e2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isBetaTester), 31, this.isAuthorized)) * 31)) * 31)) * 31;
        String str5 = this.socialProviderCodeValue;
        int e3 = unr0.e((hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.hasPlus);
        String str6 = this.firstName;
        int hashCode3 = (e3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastName;
        int hashCode4 = (hashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Date date = this.birthday;
        int hashCode5 = (hashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        String str8 = this.publicId;
        int hashCode6 = (this.partitions.hashCode() + ((hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31;
        String str9 = this.machineReadableLogin;
        return Boolean.hashCode(this.hasWebAuthNCredential) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((hashCode6 + (str9 != null ? str9.hashCode() : 0)) * 31, 31, this.is2faEnabled), 31, this.isSms2faEnabled), 31, this.isRfc2faEnabled), 31, this.isPictureLoginSupported), 31, this.isXtokenTrusted), 31, this.isBrowserAccount);
    }

    public boolean is2faEnabled() {
        return this.is2faEnabled;
    }

    @Override // com.yandex.passport.api.i
    public boolean isAuthorized() {
        return this.isAuthorized;
    }

    @Override // com.yandex.passport.api.i
    public boolean isAvatarEmpty() {
        return this.isAvatarEmpty;
    }

    @Override // com.yandex.passport.api.i
    public boolean isBetaTester() {
        return this.isBetaTester;
    }

    public boolean isBrowserAccount() {
        return this.isBrowserAccount;
    }

    public boolean isLite() {
        return getAccountType() == PassportAccountType.LITE;
    }

    public boolean isMailish() {
        return getAccountType() == PassportAccountType.MAILISH;
    }

    public boolean isPdd() {
        return getAccountType() == PassportAccountType.PDD;
    }

    public boolean isPhonish() {
        return getAccountType() == PassportAccountType.PHONISH;
    }

    public boolean isPictureLoginSupported() {
        return this.isPictureLoginSupported;
    }

    public boolean isRfc2faEnabled() {
        return this.isRfc2faEnabled;
    }

    public boolean isSms2faEnabled() {
        return this.isSms2faEnabled;
    }

    public boolean isSocial() {
        return getAccountType() == PassportAccountType.SOCIAL;
    }

    public boolean isXtokenTrusted() {
        return this.isXtokenTrusted;
    }

    @Override // com.yandex.passport.api.i
    public boolean isYandexoid() {
        return this.isYandexoid;
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair("passport-account", this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassportAccountImpl(uid=");
        sb.append(this.uid);
        sb.append(", primaryDisplayName=");
        sb.append(this.primaryDisplayName);
        sb.append(", secondaryDisplayName=");
        sb.append(this.secondaryDisplayName);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", isAvatarEmpty=");
        sb.append(this.isAvatarEmpty);
        sb.append(", nativeDefaultEmail=");
        sb.append(this.nativeDefaultEmail);
        sb.append(", isYandexoid=");
        sb.append(this.isYandexoid);
        sb.append(", yandexoidLogin=");
        sb.append(this.yandexoidLogin);
        sb.append(", isBetaTester=");
        sb.append(this.isBetaTester);
        sb.append(", isAuthorized=");
        sb.append(this.isAuthorized);
        sb.append(", stash=");
        sb.append(this.stash);
        sb.append(", androidAccount=");
        sb.append(this.androidAccount);
        sb.append(", accountType=");
        sb.append(this.accountType);
        sb.append(", socialProviderCodeValue=");
        sb.append(this.socialProviderCodeValue);
        sb.append(", hasPlus=");
        sb.append(this.hasPlus);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", publicId=");
        sb.append(this.publicId);
        sb.append(", partitions=");
        sb.append(this.partitions);
        sb.append(", machineReadableLogin=");
        sb.append(this.machineReadableLogin);
        sb.append(", is2faEnabled=");
        sb.append(this.is2faEnabled);
        sb.append(", isSms2faEnabled=");
        sb.append(this.isSms2faEnabled);
        sb.append(", isRfc2faEnabled=");
        sb.append(this.isRfc2faEnabled);
        sb.append(", isPictureLoginSupported=");
        sb.append(this.isPictureLoginSupported);
        sb.append(", isXtokenTrusted=");
        sb.append(this.isXtokenTrusted);
        sb.append(", isBrowserAccount=");
        sb.append(this.isBrowserAccount);
        sb.append(", hasWebAuthNCredential=");
        return unr0.u(sb, this.hasWebAuthNCredential, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.primaryDisplayName);
        dest.writeString(this.secondaryDisplayName);
        dest.writeString(this.avatarUrl);
        dest.writeInt(this.isAvatarEmpty ? 1 : 0);
        dest.writeString(this.nativeDefaultEmail);
        dest.writeInt(this.isYandexoid ? 1 : 0);
        dest.writeString(this.yandexoidLogin);
        dest.writeInt(this.isBetaTester ? 1 : 0);
        dest.writeInt(this.isAuthorized ? 1 : 0);
        this.stash.writeToParcel(dest, flags);
        dest.writeParcelable(this.androidAccount, flags);
        dest.writeString(this.accountType.name());
        dest.writeString(this.socialProviderCodeValue);
        dest.writeInt(this.hasPlus ? 1 : 0);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeSerializable(this.birthday);
        dest.writeString(this.publicId);
        this.partitions.writeToParcel(dest, flags);
        dest.writeString(this.machineReadableLogin);
        dest.writeInt(this.is2faEnabled ? 1 : 0);
        dest.writeInt(this.isSms2faEnabled ? 1 : 0);
        dest.writeInt(this.isRfc2faEnabled ? 1 : 0);
        dest.writeInt(this.isPictureLoginSupported ? 1 : 0);
        dest.writeInt(this.isXtokenTrusted ? 1 : 0);
        dest.writeInt(this.isBrowserAccount ? 1 : 0);
        dest.writeInt(this.hasWebAuthNCredential ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportAccountImpl> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.yandex.passport.internal.account.PassportAccountImpl createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportAccountImpl[] newArray(int i) {
            return new PassportAccountImpl[i];
        }
    }

    @Override // com.yandex.passport.api.i
    public Partitions getPartitions() {
        return this.partitions;
    }

    @Override // com.yandex.passport.api.i
    public Stash getStash() {
        return this.stash;
    }

    @Override // com.yandex.passport.api.i
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
