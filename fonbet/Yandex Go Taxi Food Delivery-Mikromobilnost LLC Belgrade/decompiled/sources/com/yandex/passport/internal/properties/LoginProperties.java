package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportScreenOrientation;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.d1;
import com.yandex.passport.api.f2;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.k3;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m3;
import com.yandex.passport.api.z0;
import com.yandex.passport.internal.AnimationTheme;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.entities.TurboAuthParams;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.properties.VisualProperties;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.wwg;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b2\b\u0081\b\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004§\u0001¨\u0001Bó\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!\u0012\b\b\u0002\u0010+\u001a\u00020\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\u0006\u0012\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u001d\u0010>\u001a\u00020=2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020;¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bF\u0010CJ\u0010\u0010G\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bO\u0010EJ\u0010\u0010P\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bP\u0010EJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bS\u0010CJ\u0010\u0010T\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bT\u0010EJ\u0012\u0010U\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bU\u0010NJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b^\u0010CJ\u001c\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\be\u0010EJ\u0012\u0010g\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bf\u0010CJ\u001c\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!HÆ\u0003¢\u0006\u0004\bh\u0010`J\u0010\u0010i\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bi\u0010EJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bj\u0010CJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bk\u0010CJ\u0010\u0010l\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bl\u0010EJ\u0012\u0010m\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bo\u0010EJ\u0010\u0010p\u001a\u000202HÆ\u0003¢\u0006\u0004\bp\u0010qJþ\u0002\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!2\b\b\u0002\u0010+\u001a\u00020\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010.\u001a\u00020\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u000202HÆ\u0001¢\u0006\u0004\br\u0010sJ\u0010\u0010u\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bu\u0010CJ\u0010\u0010v\u001a\u00020;HÖ\u0001¢\u0006\u0004\bv\u0010AJ\u001a\u0010y\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010wHÖ\u0003¢\u0006\u0004\by\u0010zR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010{\u001a\u0004\b|\u0010CR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010}\u001a\u0004\b\u0007\u0010ER\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010{\u001a\u0004\b~\u0010CR\u001b\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\n\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010HR\u001c\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010JR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010LR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010NR\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010}\u001a\u0004\b\u0011\u0010ER\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010}\u001a\u0004\b\u0012\u0010ER\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010RR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\u0015\u0010{\u001a\u0005\b\u0089\u0001\u0010CR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010}\u001a\u0004\b\u0016\u0010ER\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0085\u0001\u001a\u0005\b\u008a\u0001\u0010NR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010WR\u001c\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010YR\u001c\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010[R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010]R\u001d\u0010 \u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\r\n\u0004\b \u0010{\u001a\u0005\b\u0093\u0001\u0010CR(\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010`R\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010bR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010dR\u001b\u0010'\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\r\n\u0004\b'\u0010}\u001a\u0005\b\u009a\u0001\u0010ER%\u0010)\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\u0015\n\u0004\b)\u0010{\u0012\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\b\u009b\u0001\u0010CR(\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b*\u0010\u0094\u0001\u001a\u0005\b\u009e\u0001\u0010`R\u001a\u0010+\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010}\u001a\u0004\b+\u0010ER\u001d\u0010,\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\r\n\u0004\b,\u0010{\u001a\u0005\b\u009f\u0001\u0010CR\u001d\u0010-\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\r\n\u0004\b-\u0010{\u001a\u0005\b \u0001\u0010CR\u0017\u0010.\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010}\u001a\u0004\b.\u0010ER\u001b\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u000e\n\u0005\b0\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010nR\u001b\u00101\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\r\n\u0004\b1\u0010}\u001a\u0005\b£\u0001\u0010ER\u001c\u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b3\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010q¨\u0006©\u0001"}, d2 = {"Lcom/yandex/passport/internal/properties/LoginProperties;", "Lcom/yandex/passport/api/limited/a;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/b0;", "", "applicationPackageName", "", "isWebAmForbidden", "applicationVersion", "Lcom/yandex/passport/internal/entities/Filter;", "filter", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/internal/AnimationTheme;", "animationTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "selectedUid", "isAdditionOnlyRequired", "isRegistrationOnlyRequired", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "socialConfiguration", "loginHint", "isFromAuthSdk", "authSdkChallengeUid", "Lcom/yandex/passport/internal/entities/UserCredentials;", "userCredentials", "Lcom/yandex/passport/internal/properties/SocialRegistrationProperties;", "socialRegistrationProperties", "Lcom/yandex/passport/internal/properties/VisualProperties;", "visualProperties", "Lcom/yandex/passport/internal/properties/BindPhoneProperties;", "bindPhoneProperties", "source", "", "analyticsParams", "Lcom/yandex/passport/internal/entities/TurboAuthParams;", "turboAuthParams", "Lcom/yandex/passport/internal/properties/WebAmProperties;", "webAmProperties", "setAsCurrent", "Lcom/yandex/passport/api/a;", "additionalActionRequest", "headers", "isUpgradePhonish", "origin", "cusLocation", "isLoginFlow", "Lcom/yandex/passport/internal/properties/SelectAccountParams;", "selectAccountParams", "createMasterEnterPhoneNumberOption", "Lcom/yandex/passport/api/PassportScreenOrientation;", "lockScreenOrientation", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/internal/AnimationTheme;Lcom/yandex/passport/api/PassportUidImpl;ZZLcom/yandex/passport/api/PassportSocialConfiguration;Ljava/lang/String;ZLcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/internal/entities/UserCredentials;Lcom/yandex/passport/internal/properties/SocialRegistrationProperties;Lcom/yandex/passport/internal/properties/VisualProperties;Lcom/yandex/passport/internal/properties/BindPhoneProperties;Ljava/lang/String;Ljava/util/Map;Lcom/yandex/passport/internal/entities/TurboAuthParams;Lcom/yandex/passport/internal/properties/WebAmProperties;ZLjava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZLcom/yandex/passport/internal/properties/SelectAccountParams;ZLcom/yandex/passport/api/PassportScreenOrientation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/yandex/passport/internal/entities/Filter;", "component5", "()Lcom/yandex/passport/api/PassportTheme;", "component6", "()Lcom/yandex/passport/internal/AnimationTheme;", "component7", "()Lcom/yandex/passport/api/PassportUidImpl;", "component8", "component9", "component10", "()Lcom/yandex/passport/api/PassportSocialConfiguration;", "component11", "component12", "component13", "component14", "()Lcom/yandex/passport/internal/entities/UserCredentials;", "component15", "()Lcom/yandex/passport/internal/properties/SocialRegistrationProperties;", "component16", "()Lcom/yandex/passport/internal/properties/VisualProperties;", "component17", "()Lcom/yandex/passport/internal/properties/BindPhoneProperties;", "component18", "component19", "()Ljava/util/Map;", "component20", "()Lcom/yandex/passport/internal/entities/TurboAuthParams;", "component21", "()Lcom/yandex/passport/internal/properties/WebAmProperties;", "component22", "component23-JWfNWPw", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "()Lcom/yandex/passport/internal/properties/SelectAccountParams;", "component30", "component31", "()Lcom/yandex/passport/api/PassportScreenOrientation;", "copy-LjS6rdk", "(Ljava/lang/String;ZLjava/lang/String;Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/internal/AnimationTheme;Lcom/yandex/passport/api/PassportUidImpl;ZZLcom/yandex/passport/api/PassportSocialConfiguration;Ljava/lang/String;ZLcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/internal/entities/UserCredentials;Lcom/yandex/passport/internal/properties/SocialRegistrationProperties;Lcom/yandex/passport/internal/properties/VisualProperties;Lcom/yandex/passport/internal/properties/BindPhoneProperties;Ljava/lang/String;Ljava/util/Map;Lcom/yandex/passport/internal/entities/TurboAuthParams;Lcom/yandex/passport/internal/properties/WebAmProperties;ZLjava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZLcom/yandex/passport/internal/properties/SelectAccountParams;ZLcom/yandex/passport/api/PassportScreenOrientation;)Lcom/yandex/passport/internal/properties/LoginProperties;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationPackageName", "Z", "getApplicationVersion", "Lcom/yandex/passport/internal/entities/Filter;", "getFilter", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/internal/AnimationTheme;", "getAnimationTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "getSelectedUid", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "getSocialConfiguration", "getLoginHint", "getAuthSdkChallengeUid", "Lcom/yandex/passport/internal/entities/UserCredentials;", "getUserCredentials", "Lcom/yandex/passport/internal/properties/SocialRegistrationProperties;", "getSocialRegistrationProperties", "Lcom/yandex/passport/internal/properties/VisualProperties;", "getVisualProperties", "Lcom/yandex/passport/internal/properties/BindPhoneProperties;", "getBindPhoneProperties", "getSource", "Ljava/util/Map;", "getAnalyticsParams", "Lcom/yandex/passport/internal/entities/TurboAuthParams;", "getTurboAuthParams", "Lcom/yandex/passport/internal/properties/WebAmProperties;", "getWebAmProperties", "getSetAsCurrent", "getAdditionalActionRequest-JWfNWPw", "getAdditionalActionRequest-JWfNWPw$annotations", "()V", "getHeaders", "getOrigin", "getCusLocation", "Lcom/yandex/passport/internal/properties/SelectAccountParams;", "getSelectAccountParams", "getCreateMasterEnterPhoneNumberOption", "Lcom/yandex/passport/api/PassportScreenOrientation;", "getLockScreenOrientation", "Companion", "com/yandex/passport/internal/properties/i", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LoginProperties implements com.yandex.passport.api.limited.a, Parcelable, com.yandex.passport.internal.b0 {
    public static final int $stable = 8;
    private static final String EXTERNAL_ANALYTICS_PARAM_PREFIX = "external_";
    private static final String KEY_LOGIN_PROPERTIES = "passport-login-properties";
    private final String additionalActionRequest;
    private final Map<String, String> analyticsParams;
    private final AnimationTheme animationTheme;
    private final String applicationPackageName;
    private final String applicationVersion;
    private final PassportUidImpl authSdkChallengeUid;
    private final BindPhoneProperties bindPhoneProperties;
    private final boolean createMasterEnterPhoneNumberOption;
    private final String cusLocation;
    private final Filter filter;
    private final Map<String, String> headers;
    private final boolean isAdditionOnlyRequired;
    private final boolean isFromAuthSdk;
    private final boolean isLoginFlow;
    private final boolean isRegistrationOnlyRequired;
    private final boolean isUpgradePhonish;
    private final boolean isWebAmForbidden;
    private final PassportScreenOrientation lockScreenOrientation;
    private final String loginHint;
    private final String origin;
    private final SelectAccountParams selectAccountParams;
    private final PassportUidImpl selectedUid;
    private final boolean setAsCurrent;
    private final PassportSocialConfiguration socialConfiguration;
    private final SocialRegistrationProperties socialRegistrationProperties;
    private final String source;
    private final PassportTheme theme;
    private final TurboAuthParams turboAuthParams;
    private final UserCredentials userCredentials;
    private final VisualProperties visualProperties;
    private final WebAmProperties webAmProperties;
    public static final i Companion = new i();
    public static final Parcelable.Creator<LoginProperties> CREATOR = new Creator();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LoginProperties(String str, boolean z, String str2, Filter filter, PassportTheme passportTheme, AnimationTheme animationTheme, PassportUidImpl passportUidImpl, boolean z2, boolean z3, PassportSocialConfiguration passportSocialConfiguration, String str3, boolean z4, PassportUidImpl passportUidImpl2, UserCredentials userCredentials, SocialRegistrationProperties socialRegistrationProperties, VisualProperties visualProperties, BindPhoneProperties bindPhoneProperties, String str4, Map map, TurboAuthParams turboAuthParams, WebAmProperties webAmProperties, boolean z5, String str5, Map map2, boolean z6, String str6, String str7, boolean z7, SelectAccountParams selectAccountParams, boolean z8, PassportScreenOrientation passportScreenOrientation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, filter, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, (65536 & i) != 0 ? null : bindPhoneProperties, (131072 & i) != 0 ? null : str4, (262144 & i) != 0 ? kotlin.collections.b.f() : map, (524288 & i) != 0 ? null : turboAuthParams, (1048576 & i) != 0 ? null : webAmProperties, (2097152 & i) != 0 ? false : z5, (4194304 & i) != 0 ? null : str5, (8388608 & i) != 0 ? kotlin.collections.b.f() : map2, (16777216 & i) != 0 ? false : z6, (33554432 & i) != 0 ? null : str6, (67108864 & i) != 0 ? null : str7, (134217728 & i) != 0 ? false : z7, (268435456 & i) != 0 ? null : selectAccountParams, (536870912 & i) != 0 ? false : z8, (i & 1073741824) != 0 ? PassportScreenOrientation.None : passportScreenOrientation, null);
        SocialRegistrationProperties socialRegistrationProperties2;
        VisualProperties visualProperties2;
        String str8 = (i & 1) != 0 ? null : str;
        boolean z9 = (i & 2) != 0 ? false : z;
        String str9 = (i & 4) != 0 ? null : str2;
        PassportTheme passportTheme2 = (i & 16) != 0 ? PassportTheme.FOLLOW_SYSTEM : passportTheme;
        AnimationTheme animationTheme2 = (i & 32) != 0 ? null : animationTheme;
        PassportUidImpl passportUidImpl3 = (i & 64) != 0 ? null : passportUidImpl;
        boolean z10 = (i & 128) != 0 ? false : z2;
        boolean z11 = (i & 256) != 0 ? false : z3;
        PassportSocialConfiguration passportSocialConfiguration2 = (i & 512) != 0 ? null : passportSocialConfiguration;
        String str10 = (i & 1024) != 0 ? null : str3;
        boolean z12 = (i & 2048) != 0 ? false : z4;
        PassportUidImpl passportUidImpl4 = (i & 4096) != 0 ? null : passportUidImpl2;
        UserCredentials userCredentials2 = (i & 8192) != 0 ? null : userCredentials;
        if ((i & 16384) != 0) {
            SocialRegistrationProperties.Companion.getClass();
            socialRegistrationProperties2 = w.a();
        } else {
            socialRegistrationProperties2 = socialRegistrationProperties;
        }
        if ((32768 & i) != 0) {
            b0 b0Var = VisualProperties.Companion;
            b0Var.getClass();
            VisualProperties.a aVar = new VisualProperties.a();
            b0Var.getClass();
            visualProperties2 = b0.a(aVar);
        } else {
            visualProperties2 = visualProperties;
        }
    }

    /* renamed from: copy-LjS6rdk$default, reason: not valid java name */
    public static /* synthetic */ LoginProperties m307copyLjS6rdk$default(LoginProperties loginProperties, String str, boolean z, String str2, Filter filter, PassportTheme passportTheme, AnimationTheme animationTheme, PassportUidImpl passportUidImpl, boolean z2, boolean z3, PassportSocialConfiguration passportSocialConfiguration, String str3, boolean z4, PassportUidImpl passportUidImpl2, UserCredentials userCredentials, SocialRegistrationProperties socialRegistrationProperties, VisualProperties visualProperties, BindPhoneProperties bindPhoneProperties, String str4, Map map, TurboAuthParams turboAuthParams, WebAmProperties webAmProperties, boolean z5, String str5, Map map2, boolean z6, String str6, String str7, boolean z7, SelectAccountParams selectAccountParams, boolean z8, PassportScreenOrientation passportScreenOrientation, int i, Object obj) {
        PassportScreenOrientation passportScreenOrientation2;
        boolean z9;
        String str8 = (i & 1) != 0 ? loginProperties.applicationPackageName : str;
        boolean z10 = (i & 2) != 0 ? loginProperties.isWebAmForbidden : z;
        String str9 = (i & 4) != 0 ? loginProperties.applicationVersion : str2;
        Filter filter2 = (i & 8) != 0 ? loginProperties.filter : filter;
        PassportTheme passportTheme2 = (i & 16) != 0 ? loginProperties.theme : passportTheme;
        AnimationTheme animationTheme2 = (i & 32) != 0 ? loginProperties.animationTheme : animationTheme;
        PassportUidImpl passportUidImpl3 = (i & 64) != 0 ? loginProperties.selectedUid : passportUidImpl;
        boolean z11 = (i & 128) != 0 ? loginProperties.isAdditionOnlyRequired : z2;
        boolean z12 = (i & 256) != 0 ? loginProperties.isRegistrationOnlyRequired : z3;
        PassportSocialConfiguration passportSocialConfiguration2 = (i & 512) != 0 ? loginProperties.socialConfiguration : passportSocialConfiguration;
        String str10 = (i & 1024) != 0 ? loginProperties.loginHint : str3;
        boolean z13 = (i & 2048) != 0 ? loginProperties.isFromAuthSdk : z4;
        PassportUidImpl passportUidImpl4 = (i & 4096) != 0 ? loginProperties.authSdkChallengeUid : passportUidImpl2;
        UserCredentials userCredentials2 = (i & 8192) != 0 ? loginProperties.userCredentials : userCredentials;
        String str11 = str8;
        SocialRegistrationProperties socialRegistrationProperties2 = (i & 16384) != 0 ? loginProperties.socialRegistrationProperties : socialRegistrationProperties;
        VisualProperties visualProperties2 = (i & 32768) != 0 ? loginProperties.visualProperties : visualProperties;
        BindPhoneProperties bindPhoneProperties2 = (i & 65536) != 0 ? loginProperties.bindPhoneProperties : bindPhoneProperties;
        String str12 = (i & 131072) != 0 ? loginProperties.source : str4;
        Map map3 = (i & 262144) != 0 ? loginProperties.analyticsParams : map;
        TurboAuthParams turboAuthParams2 = (i & 524288) != 0 ? loginProperties.turboAuthParams : turboAuthParams;
        WebAmProperties webAmProperties2 = (i & 1048576) != 0 ? loginProperties.webAmProperties : webAmProperties;
        boolean z14 = (i & 2097152) != 0 ? loginProperties.setAsCurrent : z5;
        String str13 = (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? loginProperties.additionalActionRequest : str5;
        Map map4 = (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? loginProperties.headers : map2;
        boolean z15 = (i & 16777216) != 0 ? loginProperties.isUpgradePhonish : z6;
        String str14 = (i & SelfTester_JCP.DECRYPT_CFB) != 0 ? loginProperties.origin : str6;
        String str15 = (i & SelfTester_JCP.DECRYPT_CBC) != 0 ? loginProperties.cusLocation : str7;
        boolean z16 = (i & SelfTester_JCP.DECRYPT_CNT) != 0 ? loginProperties.isLoginFlow : z7;
        SelectAccountParams selectAccountParams2 = (i & SelfTester_JCP.IMITA) != 0 ? loginProperties.selectAccountParams : selectAccountParams;
        boolean z17 = (i & 536870912) != 0 ? loginProperties.createMasterEnterPhoneNumberOption : z8;
        if ((i & 1073741824) != 0) {
            z9 = z17;
            passportScreenOrientation2 = loginProperties.lockScreenOrientation;
        } else {
            passportScreenOrientation2 = passportScreenOrientation;
            z9 = z17;
        }
        return loginProperties.m310copyLjS6rdk(str11, z10, str9, filter2, passportTheme2, animationTheme2, passportUidImpl3, z11, z12, passportSocialConfiguration2, str10, z13, passportUidImpl4, userCredentials2, socialRegistrationProperties2, visualProperties2, bindPhoneProperties2, str12, map3, turboAuthParams2, webAmProperties2, z14, str13, map4, z15, str14, str15, z16, selectAccountParams2, z9, passportScreenOrientation2);
    }

    /* renamed from: getAdditionalActionRequest-JWfNWPw$annotations, reason: not valid java name */
    public static /* synthetic */ void m308getAdditionalActionRequestJWfNWPw$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationPackageName() {
        return this.applicationPackageName;
    }

    /* renamed from: component10, reason: from getter */
    public final PassportSocialConfiguration getSocialConfiguration() {
        return this.socialConfiguration;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLoginHint() {
        return this.loginHint;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsFromAuthSdk() {
        return this.isFromAuthSdk;
    }

    /* renamed from: component13, reason: from getter */
    public final PassportUidImpl getAuthSdkChallengeUid() {
        return this.authSdkChallengeUid;
    }

    /* renamed from: component14, reason: from getter */
    public final UserCredentials getUserCredentials() {
        return this.userCredentials;
    }

    /* renamed from: component15, reason: from getter */
    public final SocialRegistrationProperties getSocialRegistrationProperties() {
        return this.socialRegistrationProperties;
    }

    /* renamed from: component16, reason: from getter */
    public final VisualProperties getVisualProperties() {
        return this.visualProperties;
    }

    /* renamed from: component17, reason: from getter */
    public final BindPhoneProperties getBindPhoneProperties() {
        return this.bindPhoneProperties;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final Map<String, String> component19() {
        return this.analyticsParams;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWebAmForbidden() {
        return this.isWebAmForbidden;
    }

    /* renamed from: component20, reason: from getter */
    public final TurboAuthParams getTurboAuthParams() {
        return this.turboAuthParams;
    }

    /* renamed from: component21, reason: from getter */
    public final WebAmProperties getWebAmProperties() {
        return this.webAmProperties;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getSetAsCurrent() {
        return this.setAsCurrent;
    }

    /* renamed from: component23-JWfNWPw, reason: not valid java name and from getter */
    public final String getAdditionalActionRequest() {
        return this.additionalActionRequest;
    }

    public final Map<String, String> component24() {
        return this.headers;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsUpgradePhonish() {
        return this.isUpgradePhonish;
    }

    /* renamed from: component26, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component27, reason: from getter */
    public final String getCusLocation() {
        return this.cusLocation;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsLoginFlow() {
        return this.isLoginFlow;
    }

    /* renamed from: component29, reason: from getter */
    public final SelectAccountParams getSelectAccountParams() {
        return this.selectAccountParams;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getCreateMasterEnterPhoneNumberOption() {
        return this.createMasterEnterPhoneNumberOption;
    }

    /* renamed from: component31, reason: from getter */
    public final PassportScreenOrientation getLockScreenOrientation() {
        return this.lockScreenOrientation;
    }

    /* renamed from: component4, reason: from getter */
    public final Filter getFilter() {
        return this.filter;
    }

    /* renamed from: component5, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component6, reason: from getter */
    public final AnimationTheme getAnimationTheme() {
        return this.animationTheme;
    }

    /* renamed from: component7, reason: from getter */
    public final PassportUidImpl getSelectedUid() {
        return this.selectedUid;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAdditionOnlyRequired() {
        return this.isAdditionOnlyRequired;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsRegistrationOnlyRequired() {
        return this.isRegistrationOnlyRequired;
    }

    /* renamed from: copy-LjS6rdk, reason: not valid java name */
    public final LoginProperties m310copyLjS6rdk(String applicationPackageName, boolean isWebAmForbidden, String applicationVersion, Filter filter, PassportTheme theme, AnimationTheme animationTheme, PassportUidImpl selectedUid, boolean isAdditionOnlyRequired, boolean isRegistrationOnlyRequired, PassportSocialConfiguration socialConfiguration, String loginHint, boolean isFromAuthSdk, PassportUidImpl authSdkChallengeUid, UserCredentials userCredentials, SocialRegistrationProperties socialRegistrationProperties, VisualProperties visualProperties, BindPhoneProperties bindPhoneProperties, String source, Map<String, String> analyticsParams, TurboAuthParams turboAuthParams, WebAmProperties webAmProperties, boolean setAsCurrent, String additionalActionRequest, Map<String, String> headers, boolean isUpgradePhonish, String origin, String cusLocation, boolean isLoginFlow, SelectAccountParams selectAccountParams, boolean createMasterEnterPhoneNumberOption, PassportScreenOrientation lockScreenOrientation) {
        return new LoginProperties(applicationPackageName, isWebAmForbidden, applicationVersion, filter, theme, animationTheme, selectedUid, isAdditionOnlyRequired, isRegistrationOnlyRequired, socialConfiguration, loginHint, isFromAuthSdk, authSdkChallengeUid, userCredentials, socialRegistrationProperties, visualProperties, bindPhoneProperties, source, analyticsParams, turboAuthParams, webAmProperties, setAsCurrent, additionalActionRequest, headers, isUpgradePhonish, origin, cusLocation, isLoginFlow, selectAccountParams, createMasterEnterPhoneNumberOption, lockScreenOrientation, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object other) {
        boolean b;
        if (this != other) {
            if (other instanceof LoginProperties) {
                LoginProperties loginProperties = (LoginProperties) other;
                if (jl40.l(this.applicationPackageName, loginProperties.applicationPackageName) && this.isWebAmForbidden == loginProperties.isWebAmForbidden && jl40.l(this.applicationVersion, loginProperties.applicationVersion) && jl40.l(this.filter, loginProperties.filter) && this.theme == loginProperties.theme && jl40.l(this.animationTheme, loginProperties.animationTheme) && jl40.l(this.selectedUid, loginProperties.selectedUid) && this.isAdditionOnlyRequired == loginProperties.isAdditionOnlyRequired && this.isRegistrationOnlyRequired == loginProperties.isRegistrationOnlyRequired && this.socialConfiguration == loginProperties.socialConfiguration && jl40.l(this.loginHint, loginProperties.loginHint) && this.isFromAuthSdk == loginProperties.isFromAuthSdk && jl40.l(this.authSdkChallengeUid, loginProperties.authSdkChallengeUid) && jl40.l(this.userCredentials, loginProperties.userCredentials) && jl40.l(this.socialRegistrationProperties, loginProperties.socialRegistrationProperties) && jl40.l(this.visualProperties, loginProperties.visualProperties) && jl40.l(this.bindPhoneProperties, loginProperties.bindPhoneProperties) && jl40.l(this.source, loginProperties.source) && jl40.l(this.analyticsParams, loginProperties.analyticsParams) && jl40.l(this.turboAuthParams, loginProperties.turboAuthParams) && jl40.l(this.webAmProperties, loginProperties.webAmProperties) && this.setAsCurrent == loginProperties.setAsCurrent) {
                    String str = this.additionalActionRequest;
                    String str2 = loginProperties.additionalActionRequest;
                    if (str == null) {
                        if (str2 == null) {
                            b = true;
                            if (b && jl40.l(this.headers, loginProperties.headers) && this.isUpgradePhonish == loginProperties.isUpgradePhonish && jl40.l(this.origin, loginProperties.origin) && jl40.l(this.cusLocation, loginProperties.cusLocation) && this.isLoginFlow == loginProperties.isLoginFlow && jl40.l(this.selectAccountParams, loginProperties.selectAccountParams) && this.createMasterEnterPhoneNumberOption == loginProperties.createMasterEnterPhoneNumberOption && this.lockScreenOrientation == loginProperties.lockScreenOrientation) {
                            }
                        }
                        b = false;
                        if (b) {
                        }
                    } else {
                        if (str2 != null) {
                            b = com.yandex.passport.api.a.b(str, str2);
                            if (b) {
                            }
                        }
                        b = false;
                        if (b) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.yandex.passport.api.e1
    /* renamed from: getAdditionalActionRequest-JWfNWPw */
    public String mo243getAdditionalActionRequestJWfNWPw() {
        return this.additionalActionRequest;
    }

    @Override // com.yandex.passport.api.e1
    public Map<String, String> getAnalyticsParams() {
        return this.analyticsParams;
    }

    @Override // com.yandex.passport.api.limited.a
    public String getApplicationPackageName() {
        return this.applicationPackageName;
    }

    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    public final PassportUidImpl getAuthSdkChallengeUid() {
        return this.authSdkChallengeUid;
    }

    @Override // com.yandex.passport.api.e1
    public boolean getCreateMasterEnterPhoneNumberOption() {
        return this.createMasterEnterPhoneNumberOption;
    }

    @Override // com.yandex.passport.api.e1
    public String getCusLocation() {
        return this.cusLocation;
    }

    @Override // com.yandex.passport.api.e1
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.yandex.passport.api.e1
    public PassportScreenOrientation getLockScreenOrientation() {
        return this.lockScreenOrientation;
    }

    @Override // com.yandex.passport.api.e1
    public String getLoginHint() {
        return this.loginHint;
    }

    @Override // com.yandex.passport.api.e1
    public String getOrigin() {
        return this.origin;
    }

    public final SelectAccountParams getSelectAccountParams() {
        return this.selectAccountParams;
    }

    @Override // com.yandex.passport.api.e1
    public boolean getSetAsCurrent() {
        return this.setAsCurrent;
    }

    @Override // com.yandex.passport.api.e1
    public PassportSocialConfiguration getSocialConfiguration() {
        return this.socialConfiguration;
    }

    @Override // com.yandex.passport.api.e1
    public String getSource() {
        return this.source;
    }

    @Override // com.yandex.passport.api.e1, com.yandex.passport.internal.b0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public final UserCredentials getUserCredentials() {
        return this.userCredentials;
    }

    public int hashCode() {
        String str = this.applicationPackageName;
        int e = unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.isWebAmForbidden);
        String str2 = this.applicationVersion;
        int hashCode = (this.theme.hashCode() + ((this.filter.hashCode() + ((e + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        AnimationTheme animationTheme = this.animationTheme;
        int hashCode2 = (hashCode + (animationTheme == null ? 0 : animationTheme.hashCode())) * 31;
        PassportUidImpl passportUidImpl = this.selectedUid;
        int e2 = unr0.e(unr0.e((hashCode2 + (passportUidImpl == null ? 0 : passportUidImpl.hashCode())) * 31, 31, this.isAdditionOnlyRequired), 31, this.isRegistrationOnlyRequired);
        PassportSocialConfiguration passportSocialConfiguration = this.socialConfiguration;
        int hashCode3 = (e2 + (passportSocialConfiguration == null ? 0 : passportSocialConfiguration.hashCode())) * 31;
        String str3 = this.loginHint;
        int e3 = unr0.e((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isFromAuthSdk);
        PassportUidImpl passportUidImpl2 = this.authSdkChallengeUid;
        int hashCode4 = (e3 + (passportUidImpl2 == null ? 0 : passportUidImpl2.hashCode())) * 31;
        UserCredentials userCredentials = this.userCredentials;
        int hashCode5 = (this.visualProperties.hashCode() + ((this.socialRegistrationProperties.hashCode() + ((hashCode4 + (userCredentials == null ? 0 : userCredentials.hashCode())) * 31)) * 31)) * 31;
        BindPhoneProperties bindPhoneProperties = this.bindPhoneProperties;
        int hashCode6 = (hashCode5 + (bindPhoneProperties == null ? 0 : bindPhoneProperties.hashCode())) * 31;
        String str4 = this.source;
        int d = unr0.d((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.analyticsParams);
        TurboAuthParams turboAuthParams = this.turboAuthParams;
        int hashCode7 = (d + (turboAuthParams == null ? 0 : turboAuthParams.hashCode())) * 31;
        WebAmProperties webAmProperties = this.webAmProperties;
        int e4 = unr0.e((hashCode7 + (webAmProperties == null ? 0 : webAmProperties.hashCode())) * 31, 31, this.setAsCurrent);
        String str5 = this.additionalActionRequest;
        int e5 = unr0.e(unr0.d((e4 + (str5 == null ? 0 : com.yandex.passport.api.a.c(str5))) * 31, 31, this.headers), 31, this.isUpgradePhonish);
        String str6 = this.origin;
        int hashCode8 = (e5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cusLocation;
        int e6 = unr0.e((hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.isLoginFlow);
        SelectAccountParams selectAccountParams = this.selectAccountParams;
        return this.lockScreenOrientation.hashCode() + unr0.e((e6 + (selectAccountParams != null ? selectAccountParams.hashCode() : 0)) * 31, 31, this.createMasterEnterPhoneNumberOption);
    }

    @Override // com.yandex.passport.api.e1
    public boolean isAdditionOnlyRequired() {
        return this.isAdditionOnlyRequired;
    }

    public final boolean isFromAuthSdk() {
        return this.isFromAuthSdk;
    }

    public final boolean isLoginFlow() {
        return this.isLoginFlow;
    }

    @Override // com.yandex.passport.api.e1
    public boolean isRegistrationOnlyRequired() {
        return this.isRegistrationOnlyRequired;
    }

    @Override // com.yandex.passport.api.internal.a
    public boolean isUpgradePhonish() {
        return this.isUpgradePhonish;
    }

    public boolean isWebAmForbidden() {
        return this.isWebAmForbidden;
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_LOGIN_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoginProperties(applicationPackageName=");
        sb.append(this.applicationPackageName);
        sb.append(", isWebAmForbidden=");
        sb.append(this.isWebAmForbidden);
        sb.append(", applicationVersion=");
        sb.append(this.applicationVersion);
        sb.append(", filter=");
        sb.append(this.filter);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", animationTheme=");
        sb.append(this.animationTheme);
        sb.append(", selectedUid=");
        sb.append(this.selectedUid);
        sb.append(", isAdditionOnlyRequired=");
        sb.append(this.isAdditionOnlyRequired);
        sb.append(", isRegistrationOnlyRequired=");
        sb.append(this.isRegistrationOnlyRequired);
        sb.append(", socialConfiguration=");
        sb.append(this.socialConfiguration);
        sb.append(", loginHint=");
        sb.append(this.loginHint);
        sb.append(", isFromAuthSdk=");
        sb.append(this.isFromAuthSdk);
        sb.append(", authSdkChallengeUid=");
        sb.append(this.authSdkChallengeUid);
        sb.append(", userCredentials=");
        sb.append(this.userCredentials);
        sb.append(", socialRegistrationProperties=");
        sb.append(this.socialRegistrationProperties);
        sb.append(", visualProperties=");
        sb.append(this.visualProperties);
        sb.append(", bindPhoneProperties=");
        sb.append(this.bindPhoneProperties);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", analyticsParams=");
        sb.append(this.analyticsParams);
        sb.append(", turboAuthParams=");
        sb.append(this.turboAuthParams);
        sb.append(", webAmProperties=");
        sb.append(this.webAmProperties);
        sb.append(", setAsCurrent=");
        sb.append(this.setAsCurrent);
        sb.append(", additionalActionRequest=");
        String str = this.additionalActionRequest;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.api.a.d(str)));
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", isUpgradePhonish=");
        sb.append(this.isUpgradePhonish);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", cusLocation=");
        sb.append(this.cusLocation);
        sb.append(", isLoginFlow=");
        sb.append(this.isLoginFlow);
        sb.append(", selectAccountParams=");
        sb.append(this.selectAccountParams);
        sb.append(", createMasterEnterPhoneNumberOption=");
        sb.append(this.createMasterEnterPhoneNumberOption);
        sb.append(", lockScreenOrientation=");
        sb.append(this.lockScreenOrientation);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.applicationPackageName);
        dest.writeInt(this.isWebAmForbidden ? 1 : 0);
        dest.writeString(this.applicationVersion);
        this.filter.writeToParcel(dest, flags);
        dest.writeString(this.theme.name());
        AnimationTheme animationTheme = this.animationTheme;
        if (animationTheme == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            animationTheme.writeToParcel(dest, flags);
        }
        PassportUidImpl passportUidImpl = this.selectedUid;
        if (passportUidImpl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            passportUidImpl.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isAdditionOnlyRequired ? 1 : 0);
        dest.writeInt(this.isRegistrationOnlyRequired ? 1 : 0);
        PassportSocialConfiguration passportSocialConfiguration = this.socialConfiguration;
        if (passportSocialConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(passportSocialConfiguration.name());
        }
        dest.writeString(this.loginHint);
        dest.writeInt(this.isFromAuthSdk ? 1 : 0);
        PassportUidImpl passportUidImpl2 = this.authSdkChallengeUid;
        if (passportUidImpl2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            passportUidImpl2.writeToParcel(dest, flags);
        }
        UserCredentials userCredentials = this.userCredentials;
        if (userCredentials == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            userCredentials.writeToParcel(dest, flags);
        }
        this.socialRegistrationProperties.writeToParcel(dest, flags);
        this.visualProperties.writeToParcel(dest, flags);
        BindPhoneProperties bindPhoneProperties = this.bindPhoneProperties;
        if (bindPhoneProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bindPhoneProperties.writeToParcel(dest, flags);
        }
        dest.writeString(this.source);
        Iterator x = qv10.x(this.analyticsParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        TurboAuthParams turboAuthParams = this.turboAuthParams;
        if (turboAuthParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            turboAuthParams.writeToParcel(dest, flags);
        }
        WebAmProperties webAmProperties = this.webAmProperties;
        if (webAmProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            webAmProperties.writeToParcel(dest, flags);
        }
        dest.writeInt(this.setAsCurrent ? 1 : 0);
        u.Y(this.additionalActionRequest, dest);
        Iterator x2 = qv10.x(this.headers, dest);
        while (x2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) x2.next();
            dest.writeString((String) entry2.getKey());
            dest.writeString((String) entry2.getValue());
        }
        dest.writeInt(this.isUpgradePhonish ? 1 : 0);
        dest.writeString(this.origin);
        dest.writeString(this.cusLocation);
        dest.writeInt(this.isLoginFlow ? 1 : 0);
        SelectAccountParams selectAccountParams = this.selectAccountParams;
        if (selectAccountParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectAccountParams.writeToParcel(dest, flags);
        }
        dest.writeInt(this.createMasterEnterPhoneNumberOption ? 1 : 0);
        dest.writeString(this.lockScreenOrientation.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoginProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginProperties createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Filter filter;
            AnimationTheme animationTheme;
            boolean z3;
            PassportSocialConfiguration passportSocialConfiguration;
            boolean z4;
            Object obj;
            boolean z5;
            VisualProperties visualProperties;
            BindPhoneProperties createFromParcel;
            SelectAccountParams selectAccountParams;
            String str;
            boolean z6;
            String str2;
            SelectAccountParams createFromParcel2;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString2 = parcel.readString();
            Filter createFromParcel3 = Filter.CREATOR.createFromParcel(parcel);
            PassportTheme valueOf = PassportTheme.valueOf(parcel.readString());
            AnimationTheme createFromParcel4 = parcel.readInt() == 0 ? null : AnimationTheme.CREATOR.createFromParcel(parcel);
            PassportUidImpl createFromParcel5 = parcel.readInt() == 0 ? null : PassportUidImpl.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                filter = createFromParcel3;
                animationTheme = createFromParcel4;
                z3 = true;
            } else {
                filter = createFromParcel3;
                animationTheme = createFromParcel4;
                z3 = z2;
            }
            if (parcel.readInt() != 0) {
                passportSocialConfiguration = null;
                z4 = true;
            } else {
                passportSocialConfiguration = null;
                z4 = z2;
            }
            PassportSocialConfiguration valueOf2 = parcel.readInt() == 0 ? passportSocialConfiguration : PassportSocialConfiguration.valueOf(parcel.readString());
            Filter filter2 = filter;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                obj = passportSocialConfiguration;
                z5 = true;
            } else {
                obj = passportSocialConfiguration;
                z5 = z2;
            }
            PassportUidImpl passportUidImpl = (PassportUidImpl) (parcel.readInt() == 0 ? obj : PassportUidImpl.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() != 0) {
                obj = UserCredentials.CREATOR.createFromParcel(parcel);
            }
            UserCredentials userCredentials = (UserCredentials) obj;
            SocialRegistrationProperties createFromParcel6 = SocialRegistrationProperties.CREATOR.createFromParcel(parcel);
            VisualProperties createFromParcel7 = VisualProperties.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                visualProperties = createFromParcel7;
                createFromParcel = null;
            } else {
                visualProperties = createFromParcel7;
                createFromParcel = BindPhoneProperties.CREATOR.createFromParcel(parcel);
            }
            BindPhoneProperties bindPhoneProperties = createFromParcel;
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z7 = z;
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                readInt = readInt;
                createFromParcel6 = createFromParcel6;
            }
            SocialRegistrationProperties socialRegistrationProperties = createFromParcel6;
            TurboAuthParams createFromParcel8 = parcel.readInt() == 0 ? null : TurboAuthParams.CREATOR.createFromParcel(parcel);
            WebAmProperties createFromParcel9 = parcel.readInt() == 0 ? null : WebAmProperties.CREATOR.createFromParcel(parcel);
            boolean z8 = parcel.readInt() != 0;
            String m = u.m(parcel);
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = xvz.b(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                readInt2 = readInt2;
                z8 = z8;
            }
            boolean z9 = z8;
            boolean z10 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            VisualProperties visualProperties2 = visualProperties;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                selectAccountParams = null;
                str = readString2;
                z6 = true;
            } else {
                selectAccountParams = null;
                str = readString2;
                z6 = false;
            }
            if (parcel.readInt() == 0) {
                SelectAccountParams selectAccountParams2 = selectAccountParams;
                str2 = readString;
                createFromParcel2 = selectAccountParams2;
            } else {
                str2 = readString;
                createFromParcel2 = SelectAccountParams.CREATOR.createFromParcel(parcel);
            }
            return new LoginProperties(str2, z7, str, filter2, valueOf, animationTheme, createFromParcel5, z3, z4, valueOf2, readString3, z5, passportUidImpl, userCredentials, socialRegistrationProperties, visualProperties2, bindPhoneProperties, readString4, linkedHashMap, createFromParcel8, createFromParcel9, z9, m, linkedHashMap2, z10, readString5, readString6, z6, createFromParcel2, parcel.readInt() != 0, PassportScreenOrientation.valueOf(parcel.readString()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginProperties[] newArray(int i) {
            return new LoginProperties[i];
        }
    }

    @Override // com.yandex.passport.api.e1
    public AnimationTheme getAnimationTheme() {
        return this.animationTheme;
    }

    @Override // com.yandex.passport.api.e1
    public BindPhoneProperties getBindPhoneProperties() {
        return this.bindPhoneProperties;
    }

    @Override // com.yandex.passport.api.e1
    public Filter getFilter() {
        return this.filter;
    }

    @Override // com.yandex.passport.api.e1
    public PassportUidImpl getSelectedUid() {
        return this.selectedUid;
    }

    @Override // com.yandex.passport.api.e1
    public SocialRegistrationProperties getSocialRegistrationProperties() {
        return this.socialRegistrationProperties;
    }

    @Override // com.yandex.passport.api.e1
    public TurboAuthParams getTurboAuthParams() {
        return this.turboAuthParams;
    }

    @Override // com.yandex.passport.api.e1
    public VisualProperties getVisualProperties() {
        return this.visualProperties;
    }

    @Override // com.yandex.passport.api.e1
    public WebAmProperties getWebAmProperties() {
        return this.webAmProperties;
    }

    /* loaded from: classes15.dex */
    public static final class a implements d1, com.yandex.passport.api.internal.a, com.yandex.passport.api.limited.a {
        public k2 A;
        public boolean B;
        public boolean C;
        public PassportSocialConfiguration D;
        public String E;
        public UserCredentials F;
        public f2 G;
        public k3 H;
        public com.yandex.passport.api.c0 I;
        public String J;
        public Map K;
        public j2 L;
        public m3 M;
        public boolean N;
        public String O;
        public final Map P;
        public boolean Q;
        public String R;
        public String S;
        public boolean T;
        public PassportScreenOrientation U;
        public boolean a;
        public z0 b;
        public String c;
        public boolean w;
        public String x;
        public PassportTheme y;
        public com.yandex.passport.api.o z;

        public a(LoginProperties loginProperties) {
            this.y = PassportTheme.FOLLOW_SYSTEM;
            SocialRegistrationProperties.Companion.getClass();
            this.G = w.a();
            b0 b0Var = VisualProperties.Companion;
            b0Var.getClass();
            VisualProperties.a aVar = new VisualProperties.a();
            b0Var.getClass();
            this.H = b0.a(aVar);
            this.K = kotlin.collections.b.f();
            this.P = kotlin.collections.b.f();
            this.U = PassportScreenOrientation.None;
            this.c = loginProperties.getApplicationPackageName();
            this.x = loginProperties.getApplicationVersion();
            this.b = loginProperties.getFilter();
            this.y = loginProperties.getTheme();
            this.z = loginProperties.getAnimationTheme();
            this.A = loginProperties.getSelectedUid();
            this.B = loginProperties.isAdditionOnlyRequired();
            this.C = loginProperties.isRegistrationOnlyRequired();
            this.D = loginProperties.getSocialConfiguration();
            this.E = loginProperties.getLoginHint();
            this.a = loginProperties.isFromAuthSdk();
            this.F = loginProperties.getUserCredentials();
            this.G = loginProperties.getSocialRegistrationProperties();
            this.H = loginProperties.getVisualProperties();
            this.I = loginProperties.getBindPhoneProperties();
            this.K = loginProperties.getAnalyticsParams();
            this.L = loginProperties.getTurboAuthParams();
            this.M = loginProperties.getWebAmProperties();
            this.O = loginProperties.mo243getAdditionalActionRequestJWfNWPw();
            this.N = loginProperties.getSetAsCurrent();
            this.Q = loginProperties.isUpgradePhonish();
            this.R = loginProperties.getOrigin();
            this.S = loginProperties.getCusLocation();
            this.T = loginProperties.getCreateMasterEnterPhoneNumberOption();
            this.U = loginProperties.getLockScreenOrientation();
        }

        public final LoginProperties a() {
            AnimationTheme animationTheme;
            PassportUidImpl passportUidImpl;
            BindPhoneProperties bindPhoneProperties;
            WebAmProperties webAmProperties;
            z0 z0Var = this.b;
            if (z0Var == null) {
                ny61.r("You must set filter");
                return null;
            }
            String str = this.c;
            boolean z = this.w;
            String str2 = this.x;
            Filter.Companion.getClass();
            Filter a = com.yandex.passport.internal.entities.f.a(z0Var);
            PassportTheme passportTheme = this.y;
            com.yandex.passport.api.o oVar = this.z;
            if (oVar != null) {
                AnimationTheme.Companion.getClass();
                animationTheme = com.yandex.passport.internal.c.a(oVar);
            } else {
                animationTheme = null;
            }
            k2 k2Var = this.A;
            if (k2Var != null) {
                PassportUidImpl.Companion.getClass();
                passportUidImpl = l2.a(k2Var);
            } else {
                passportUidImpl = null;
            }
            boolean z2 = this.B;
            boolean z3 = this.C;
            PassportSocialConfiguration passportSocialConfiguration = this.D;
            String str3 = this.E;
            boolean z4 = this.a;
            UserCredentials userCredentials = this.F;
            f2 f2Var = this.G;
            SocialRegistrationProperties.Companion.getClass();
            SocialRegistrationProperties b = w.b(f2Var);
            k3 k3Var = this.H;
            VisualProperties.Companion.getClass();
            VisualProperties a2 = b0.a(k3Var);
            com.yandex.passport.api.c0 c0Var = this.I;
            if (c0Var != null) {
                BindPhoneProperties.Companion.getClass();
                bindPhoneProperties = f.a(c0Var);
            } else {
                bindPhoneProperties = null;
            }
            String str4 = this.J;
            Map map = this.K;
            j2 j2Var = this.L;
            TurboAuthParams turboAuthParams = j2Var != null ? new TurboAuthParams(j2Var) : null;
            m3 m3Var = this.M;
            if (m3Var != null) {
                WebAmProperties.Companion.getClass();
                webAmProperties = d0.a(m3Var);
            } else {
                webAmProperties = null;
            }
            return new LoginProperties(str, z, str2, a, passportTheme, animationTheme, passportUidImpl, z2, z3, passportSocialConfiguration, str3, z4, null, userCredentials, b, a2, bindPhoneProperties, str4, map, turboAuthParams, webAmProperties, this.N, this.O, this.P, this.Q, this.R, this.S, false, null, this.T, this.U, 402657280, null);
        }

        public final void b(LoginProperties loginProperties) {
            if (loginProperties == null) {
                if (loginProperties != null) {
                    this.b = loginProperties.getFilter();
                    this.y = loginProperties.getTheme();
                    this.z = loginProperties.getAnimationTheme();
                    this.A = loginProperties.getSelectedUid();
                    this.B = loginProperties.isAdditionOnlyRequired();
                    this.C = loginProperties.isRegistrationOnlyRequired();
                    this.D = loginProperties.getSocialConfiguration();
                    this.E = loginProperties.getLoginHint();
                    this.G = loginProperties.getSocialRegistrationProperties();
                    this.H = loginProperties.getVisualProperties();
                    this.I = loginProperties.getBindPhoneProperties();
                    this.K = loginProperties.getAnalyticsParams();
                    this.L = loginProperties.getTurboAuthParams();
                    this.M = loginProperties.getWebAmProperties();
                    this.O = loginProperties.mo243getAdditionalActionRequestJWfNWPw();
                    this.N = loginProperties.getSetAsCurrent();
                    this.R = loginProperties.getOrigin();
                    this.S = loginProperties.getCusLocation();
                    this.T = loginProperties.getCreateMasterEnterPhoneNumberOption();
                    this.U = loginProperties.getLockScreenOrientation();
                    return;
                }
                return;
            }
            this.c = loginProperties.getApplicationPackageName();
            this.x = loginProperties.getApplicationVersion();
            this.b = loginProperties.getFilter();
            this.y = loginProperties.getTheme();
            this.z = loginProperties.getAnimationTheme();
            this.A = loginProperties.getSelectedUid();
            this.B = loginProperties.isAdditionOnlyRequired();
            this.C = loginProperties.isRegistrationOnlyRequired();
            this.D = loginProperties.getSocialConfiguration();
            this.E = loginProperties.getLoginHint();
            this.a = loginProperties.isFromAuthSdk();
            this.F = loginProperties.getUserCredentials();
            this.G = loginProperties.getSocialRegistrationProperties();
            this.H = loginProperties.getVisualProperties();
            this.I = loginProperties.getBindPhoneProperties();
            this.K = loginProperties.getAnalyticsParams();
            this.L = loginProperties.getTurboAuthParams();
            this.M = loginProperties.getWebAmProperties();
            this.O = loginProperties.mo243getAdditionalActionRequestJWfNWPw();
            this.N = loginProperties.getSetAsCurrent();
            this.Q = loginProperties.isUpgradePhonish();
            this.R = loginProperties.getOrigin();
            this.S = loginProperties.getCusLocation();
            this.T = loginProperties.getCreateMasterEnterPhoneNumberOption();
            this.U = loginProperties.getLockScreenOrientation();
        }

        public final /* synthetic */ void c() {
            this.B = false;
        }

        public final a d() {
            this.N = true;
            return this;
        }

        public final /* bridge */ /* synthetic */ a e(Filter filter) {
            g(filter);
            return this;
        }

        public final /* synthetic */ void f(Filter filter) {
            this.b = filter;
        }

        public final void g(Filter filter) {
            Filter.Companion.getClass();
            this.b = com.yandex.passport.internal.entities.f.a(filter);
        }

        @Override // com.yandex.passport.api.e1
        /* renamed from: getAdditionalActionRequest-JWfNWPw */
        public final String mo243getAdditionalActionRequestJWfNWPw() {
            return this.O;
        }

        @Override // com.yandex.passport.api.e1
        public final Map getAnalyticsParams() {
            return this.K;
        }

        @Override // com.yandex.passport.api.e1
        public final com.yandex.passport.api.o getAnimationTheme() {
            return this.z;
        }

        @Override // com.yandex.passport.api.limited.a
        public final String getApplicationPackageName() {
            return this.c;
        }

        @Override // com.yandex.passport.api.e1
        public final com.yandex.passport.api.c0 getBindPhoneProperties() {
            return this.I;
        }

        @Override // com.yandex.passport.api.e1
        public final boolean getCreateMasterEnterPhoneNumberOption() {
            return this.T;
        }

        @Override // com.yandex.passport.api.e1
        public final String getCusLocation() {
            return this.S;
        }

        @Override // com.yandex.passport.api.e1
        public final z0 getFilter() {
            z0 z0Var = this.b;
            if (z0Var != null) {
                return z0Var;
            }
            return null;
        }

        @Override // com.yandex.passport.api.e1
        public final Map getHeaders() {
            return this.P;
        }

        @Override // com.yandex.passport.api.e1
        public final PassportScreenOrientation getLockScreenOrientation() {
            return this.U;
        }

        @Override // com.yandex.passport.api.e1
        public final String getLoginHint() {
            return this.E;
        }

        @Override // com.yandex.passport.api.e1
        public final String getOrigin() {
            return this.R;
        }

        @Override // com.yandex.passport.api.e1
        public final k2 getSelectedUid() {
            return this.A;
        }

        @Override // com.yandex.passport.api.e1
        public final boolean getSetAsCurrent() {
            return this.N;
        }

        @Override // com.yandex.passport.api.e1
        public final PassportSocialConfiguration getSocialConfiguration() {
            return this.D;
        }

        @Override // com.yandex.passport.api.e1
        public final f2 getSocialRegistrationProperties() {
            return this.G;
        }

        @Override // com.yandex.passport.api.e1
        public final String getSource() {
            return this.J;
        }

        @Override // com.yandex.passport.api.e1, com.yandex.passport.internal.b0
        public final PassportTheme getTheme() {
            return this.y;
        }

        @Override // com.yandex.passport.api.e1
        public final j2 getTurboAuthParams() {
            return this.L;
        }

        @Override // com.yandex.passport.api.e1
        public final k3 getVisualProperties() {
            return this.H;
        }

        @Override // com.yandex.passport.api.e1
        public final m3 getWebAmProperties() {
            return this.M;
        }

        public final a h(PassportTheme passportTheme) {
            this.y = passportTheme;
            return this;
        }

        public final /* synthetic */ void i(PassportTheme passportTheme) {
            this.y = passportTheme;
        }

        @Override // com.yandex.passport.api.e1
        public final boolean isAdditionOnlyRequired() {
            return this.B;
        }

        @Override // com.yandex.passport.api.e1
        public final boolean isRegistrationOnlyRequired() {
            return this.C;
        }

        @Override // com.yandex.passport.api.internal.a
        public final boolean isUpgradePhonish() {
            return this.Q;
        }

        public final a j(TurboAuthParams turboAuthParams) {
            this.L = new TurboAuthParams(turboAuthParams);
            return this;
        }

        public final a k(VisualProperties visualProperties) {
            VisualProperties.Companion.getClass();
            this.H = b0.a(visualProperties);
            return this;
        }

        public final a l(WebAmProperties webAmProperties) {
            WebAmProperties.Companion.getClass();
            this.M = d0.a(webAmProperties);
            return this;
        }

        public a() {
            this.y = PassportTheme.FOLLOW_SYSTEM;
            SocialRegistrationProperties.Companion.getClass();
            this.G = w.a();
            b0 b0Var = VisualProperties.Companion;
            b0Var.getClass();
            VisualProperties.a aVar = new VisualProperties.a();
            b0Var.getClass();
            this.H = b0.a(aVar);
            this.K = kotlin.collections.b.f();
            this.P = kotlin.collections.b.f();
            this.U = PassportScreenOrientation.None;
        }
    }

    private LoginProperties(String str, boolean z, String str2, Filter filter, PassportTheme passportTheme, AnimationTheme animationTheme, PassportUidImpl passportUidImpl, boolean z2, boolean z3, PassportSocialConfiguration passportSocialConfiguration, String str3, boolean z4, PassportUidImpl passportUidImpl2, UserCredentials userCredentials, SocialRegistrationProperties socialRegistrationProperties, VisualProperties visualProperties, BindPhoneProperties bindPhoneProperties, String str4, Map<String, String> map, TurboAuthParams turboAuthParams, WebAmProperties webAmProperties, boolean z5, String str5, Map<String, String> map2, boolean z6, String str6, String str7, boolean z7, SelectAccountParams selectAccountParams, boolean z8, PassportScreenOrientation passportScreenOrientation) {
        this.applicationPackageName = str;
        this.isWebAmForbidden = z;
        this.applicationVersion = str2;
        this.filter = filter;
        this.theme = passportTheme;
        this.animationTheme = animationTheme;
        this.selectedUid = passportUidImpl;
        this.isAdditionOnlyRequired = z2;
        this.isRegistrationOnlyRequired = z3;
        this.socialConfiguration = passportSocialConfiguration;
        this.loginHint = str3;
        this.isFromAuthSdk = z4;
        this.authSdkChallengeUid = passportUidImpl2;
        this.userCredentials = userCredentials;
        this.socialRegistrationProperties = socialRegistrationProperties;
        this.visualProperties = visualProperties;
        this.bindPhoneProperties = bindPhoneProperties;
        this.source = str4;
        this.analyticsParams = map;
        this.turboAuthParams = turboAuthParams;
        this.webAmProperties = webAmProperties;
        this.setAsCurrent = z5;
        this.additionalActionRequest = str5;
        this.headers = map2;
        this.isUpgradePhonish = z6;
        this.origin = str6;
        this.cusLocation = str7;
        this.isLoginFlow = z7;
        this.selectAccountParams = selectAccountParams;
        this.createMasterEnterPhoneNumberOption = z8;
        this.lockScreenOrientation = passportScreenOrientation;
    }

    public /* synthetic */ LoginProperties(String str, boolean z, String str2, Filter filter, PassportTheme passportTheme, AnimationTheme animationTheme, PassportUidImpl passportUidImpl, boolean z2, boolean z3, PassportSocialConfiguration passportSocialConfiguration, String str3, boolean z4, PassportUidImpl passportUidImpl2, UserCredentials userCredentials, SocialRegistrationProperties socialRegistrationProperties, VisualProperties visualProperties, BindPhoneProperties bindPhoneProperties, String str4, Map map, TurboAuthParams turboAuthParams, WebAmProperties webAmProperties, boolean z5, String str5, Map map2, boolean z6, String str6, String str7, boolean z7, SelectAccountParams selectAccountParams, boolean z8, PassportScreenOrientation passportScreenOrientation, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, filter, passportTheme, animationTheme, passportUidImpl, z2, z3, passportSocialConfiguration, str3, z4, passportUidImpl2, userCredentials, socialRegistrationProperties, visualProperties, bindPhoneProperties, str4, map, turboAuthParams, webAmProperties, z5, str5, map2, z6, str6, str7, z7, selectAccountParams, z8, passportScreenOrientation);
    }
}
