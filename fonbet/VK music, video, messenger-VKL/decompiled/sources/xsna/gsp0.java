package xsna;

import android.app.backup.BackupManager;
import android.content.Context;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.d;
import com.vk.api.generated.auth.dto.AuthRefreshTrustedHashesResponseDto;
import com.vk.api.generated.auth.dto.AuthTrustedHashIndexedDto;
import com.vk.api.generated.auth.dto.AuthTrustedHashIndexedErrorDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecosystem.backup.domain.TrustedHashRefreshWorker;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.chromium.base.TimeUtils;

/* compiled from: TrustedHashRefresher.kt */
/* loaded from: classes18.dex */
public final class gsp0 {
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public final Context a;
    public final bpn0 b = new bpn0(new x2j0(this, 7));
    public final bpn0 c = new bpn0(new h6m0(this, 4));

    /* compiled from: TrustedHashRefresher.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final String c;

        public a(UserId userId, String str, String str2) {
            this.a = userId;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrustedHashRefreshRequest(userId=");
            sb.append(this.a);
            sb.append(", accessToken=");
            sb.append(this.b);
            sb.append(", trustedHash=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public gsp0(Context context) {
        this.a = context.getApplicationContext();
    }

    public final int a(ArrayList arrayList) {
        List<AuthTrustedHashIndexedDto> list;
        String b;
        int i = 0;
        try {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a) it.next()).b);
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((a) it2.next()).c);
            }
            Context context = this.a;
            String str = m8f0.a;
            synchronized (m8f0.class) {
                b = m8f0.b(context);
            }
            ufx ufxVar = new ufx("auth.refreshTrustedHashes", new rf3(3), new ct(4));
            ufxVar.h("access_tokens", arrayList2);
            ufxVar.h("trusted_hashes", arrayList3);
            if (b != null) {
                ufx.n(ufxVar, "device_id", b, 0, 12);
            }
            bx2 e = e370.e(ufxVar);
            e370.a(e);
            AuthRefreshTrustedHashesResponseDto authRefreshTrustedHashesResponseDto = (AuthRefreshTrustedHashesResponseDto) e.f(dgn0.c());
            for (AuthTrustedHashIndexedErrorDto authTrustedHashIndexedErrorDto : authRefreshTrustedHashesResponseDto.d()) {
                L.G("TrustedHashRefresh", "Trusted hash refresh error at index " + authTrustedHashIndexedErrorDto.e() + ": " + authTrustedHashIndexedErrorDto.d() + ", " + authTrustedHashIndexedErrorDto.getDescription());
            }
            list = authRefreshTrustedHashesResponseDto.e();
        } catch (Throwable th) {
            L.f("TrustedHashRefresh", "An error occurred at auth.refreshTrustedHashes", th);
            list = EmptyList.b;
        }
        for (AuthTrustedHashIndexedDto authTrustedHashIndexedDto : list) {
            a aVar = (a) j5g.b0(authTrustedHashIndexedDto.d(), arrayList);
            if (aVar != null && !epx.f(aVar.c, authTrustedHashIndexedDto.e())) {
                ((hsp0) this.b.getValue()).c(aVar.a, authTrustedHashIndexedDto.e());
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Object failure;
        a aVar;
        String obj;
        Long n;
        Context context = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        bpn0 bpn0Var = this.c;
        if (!((b25) bpn0Var.getValue()).b()) {
            d(currentTimeMillis);
            return;
        }
        try {
            File file = new File(context.getNoBackupFilesDir(), "trusted_hash_refresh_ts");
            if (!file.exists()) {
                file = null;
            }
            failure = Long.valueOf((file == null || (obj = drm0.p0(nbr.r(file, emb.b)).toString()) == null || (n = arm0.n(obj)) == null) ? 0L : n.longValue());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = 0L;
        }
        if (currentTimeMillis - ((Number) failure).longValue() < TimeUtils.MILLISECONDS_PER_DAY) {
            L.p("TrustedHashRefresh", "Skip trusted hash refresh: daily timeout has not expired");
            return;
        }
        AtomicBoolean atomicBoolean = d;
        if (!atomicBoolean.compareAndSet(false, true)) {
            L.p("TrustedHashRefresh", "Skip trusted hash refresh: refresh is already in progress");
            return;
        }
        try {
            Set<Map.Entry<UserId, String>> entrySet = ((hsp0) this.b.getValue()).a().entrySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String s = ((b25) bpn0Var.getValue()).s((UserId) entry.getKey());
                if (s != null) {
                    if (drm0.N(s)) {
                        s = null;
                    }
                    if (s != null) {
                        aVar = new a((UserId) entry.getKey(), s, (String) entry.getValue());
                        if (aVar == null) {
                            arrayList.add(aVar);
                        }
                    }
                }
                aVar = null;
                if (aVar == null) {
                }
            }
            if (arrayList.isEmpty()) {
                L.p("TrustedHashRefresh", "Skip trusted hash refresh: no eligible trusted hashes");
                atomicBoolean.set(false);
                return;
            }
            int a2 = a(arrayList);
            if (a2 > 0) {
                new BackupManager(context).dataChanged();
            }
            d(System.currentTimeMillis());
            L.p("TrustedHashRefresh", "Trusted hash refresh finished, updated count: " + a2);
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            atomicBoolean.set(false);
            throw th2;
        }
    }

    public final void c() {
        d.a aVar = new d.a(TrustedHashRefreshWorker.class, 1L, TimeUnit.DAYS);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        dwx0.h(this.a).e("vkidmp_trusted_hash_refresh", ExistingPeriodicWorkPolicy.KEEP, aVar.f(new p6j(new b560(null), NetworkType.UNMETERED, true, false, false, false, -1L, -1L, j5g.S0(linkedHashSet))).b());
    }

    public final void d(long j) {
        Object failure;
        try {
            nbr.w(new File(this.a.getNoBackupFilesDir(), "trusted_hash_refresh_ts"), String.valueOf(j), emb.b);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.f("TrustedHashRefresh", "Failed to save trusted hash refresh timestamp", a2);
        }
    }
}
