package com.vk.whitelabelauth.di;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import xsna.bpn0;
import xsna.chr0;

/* compiled from: WhiteLabelAuthRouter.kt */
/* loaded from: classes7.dex */
public interface b {
    public static final a a = a.a;

    /* compiled from: WhiteLabelAuthRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final bpn0 b = new bpn0(new chr0(11));

        /* compiled from: WhiteLabelAuthRouter.kt */
        /* renamed from: com.vk.whitelabelauth.di.b$a$a, reason: collision with other inner class name */
        public static final class C2098a implements b {
            @Override // com.vk.whitelabelauth.di.b
            public final Bundle a() {
                return new Bundle();
            }

            @Override // com.vk.whitelabelauth.di.b
            public final Fragment b() {
                return new Fragment();
            }
        }

        public static b a() {
            return (b) b.getValue();
        }
    }

    Bundle a();

    Fragment b();
}
