package com.vkontakte.android.task.before;

import com.vk.core.apps.BuildInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.VKApplication;
import xsna.epx;
import xsna.fkq0;
import xsna.ho8;
import xsna.s3q0;
import xsna.zfl;

/* compiled from: UserIdLegacyTrackerTaskLogic.kt */
/* loaded from: classes11.dex */
public final class UserIdLegacyTrackerTaskLogic extends ParallelTaskRunner.d {

    /* compiled from: UserIdLegacyTrackerTaskLogic.kt */
    /* loaded from: classes7.dex */
    public static final class UserIdLegacyUsageException extends IllegalStateException {
        public UserIdLegacyUsageException(String str) {
            super(str);
        }
    }

    /* compiled from: UserIdLegacyTrackerTaskLogic.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final StackTraceElement a;
        public final String b;

        public a(StackTraceElement stackTraceElement, String str) {
            this.a = stackTraceElement;
            this.b = str;
        }

        public final StackTraceElement a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UsageSelector(element=");
            sb.append(this.a);
            sb.append(", className=");
            return ho8.a(sb, this.b, ')');
        }
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "UserIdLagacyTracker";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (BuildInfo.h()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            UserId.b bVar = UserId.c;
            zfl zflVar = new zfl(this, 8);
            synchronized (bVar) {
                fkq0.a = zflVar;
            }
        }
        return s3q0.a;
    }
}
