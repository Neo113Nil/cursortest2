package xsna;

import android.app.Application;
import android.os.Bundle;
import com.vk.contacts.ContactsManager;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.config.PushInfoBarScheduleRepeat;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.VKActivity;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: ConfigStub.kt */
/* loaded from: classes2.dex */
public final class vxi implements zwi {
    public final EmptySet a;
    public final EmptySet b;

    /* compiled from: ConfigStub.kt */
    public static final class a {
    }

    /* compiled from: ConfigStub.kt */
    public static final class e implements xt50<String> {
        @Override // xsna.xt50
        public final /* bridge */ /* synthetic */ String get() {
            return null;
        }
    }

    public vxi() {
        EmptySet emptySet = EmptySet.b;
        this.a = emptySet;
        this.b = emptySet;
        EmptyList emptyList = EmptyList.b;
        PushInfoBarScheduleRepeat pushInfoBarScheduleRepeat = PushInfoBarScheduleRepeat.STOP;
        new bje0(emptyList, pushInfoBarScheduleRepeat);
        new bje0(emptyList, pushInfoBarScheduleRepeat);
        ContactsManager.a.getSTUB();
    }

    @Override // xsna.zwi
    public final String c() {
        return "";
    }

    @Override // xsna.zwi
    public final int d() {
        return 0;
    }

    @Override // xsna.zwi
    public final boolean e() {
        return false;
    }

    @Override // xsna.zwi
    public final Set<Long> f() {
        return this.a;
    }

    @Override // xsna.zwi
    public final int h() {
        return 0;
    }

    @Override // xsna.zwi
    public final int i() {
        return 0;
    }

    @Override // xsna.zwi
    public final Set<UserId> j() {
        return this.b;
    }

    /* compiled from: ConfigStub.kt */
    public static final class c implements cdg0 {
        @Override // xsna.cdg0
        public final void a() {
        }

        @Override // xsna.cdg0
        public final void b(long j, UserId userId) {
        }
    }

    /* compiled from: ConfigStub.kt */
    public static final class f implements ohp0 {
        @Override // xsna.ohp0
        public final String getId() {
            return "";
        }

        @Override // xsna.ohp0
        public final void g() {
        }

        @Override // xsna.ohp0
        public final void a(Throwable th) {
        }

        @Override // xsna.ohp0
        public final void b(ohp0 ohp0Var) {
        }

        @Override // xsna.ohp0
        public final void d(long j) {
        }

        @Override // xsna.ohp0
        public final void e(long j) {
        }

        @Override // xsna.ohp0
        public final void f(Bundle bundle) {
        }

        @Override // xsna.ohp0
        public final void h(izs<? super Event, s3q0> izsVar) {
        }

        @Override // xsna.ohp0
        public final void i(VKActivity vKActivity) {
        }

        @Override // xsna.ohp0
        public final void j(VKActivity vKActivity) {
        }

        @Override // xsna.ohp0
        public final void k(Event event) {
        }

        @Override // xsna.ohp0
        public final void l(String str) {
        }

        @Override // xsna.ohp0
        public final void c(Application application, Bundle bundle, gzs<s3q0> gzsVar) {
        }
    }

    @Override // xsna.zwi
    public final zwi g(Peer peer) {
        return this;
    }

    /* compiled from: ConfigStub.kt */
    public static final class d implements emk0 {
        @Override // xsna.emk0
        public final void a(long j, UserId userId) {
        }
    }

    /* compiled from: ConfigStub.kt */
    public static final class b implements b0f0 {
        @Override // xsna.b0f0
        public final void g(int i, String str, String str2, String str3) {
        }
    }
}
