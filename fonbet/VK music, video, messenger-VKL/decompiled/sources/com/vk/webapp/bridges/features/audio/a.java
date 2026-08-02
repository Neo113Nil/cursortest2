package com.vk.webapp.bridges.features.audio;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.player.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.k840;
import xsna.u2b0;

/* compiled from: WebAppAudioManager.kt */
/* loaded from: classes7.dex */
public final class a {
    public static final a a = new a();
    public static final ArrayList<WeakReference<InterfaceC2095a>> b = new ArrayList<>();
    public static final u2b0 c;
    public static PlayState d;
    public static b e;

    /* compiled from: WebAppAudioManager.kt */
    /* renamed from: com.vk.webapp.bridges.features.audio.a$a, reason: collision with other inner class name */
    public interface InterfaceC2095a {
        void a(PlayState playState);
    }

    /* compiled from: WebAppAudioManager.kt */
    public static final class b {
        public final int a;
        public final VkUiAudioType b;

        public b(int i, VkUiAudioType vkUiAudioType) {
            this.a = i;
            this.b = vkUiAudioType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Owner(ownerId=" + this.a + ", type=" + this.b + ')';
        }
    }

    /* compiled from: WebAppAudioManager.kt */
    public static final class c extends e.a {
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            if (playState == null || a.d == playState) {
                return;
            }
            Iterator<WeakReference<InterfaceC2095a>> it = a.b.iterator();
            while (it.hasNext()) {
                InterfaceC2095a interfaceC2095a = it.next().get();
                if (interfaceC2095a == null) {
                    it.remove();
                } else {
                    interfaceC2095a.a(a.c.m0());
                }
            }
            a.d = playState;
        }
    }

    static {
        u2b0 b2 = k840.a.g().b();
        c = b2;
        c cVar = new c();
        d = PlayState.STOPPED;
        b2.P0(cVar, false);
    }

    public static boolean a(int i) {
        Integer Ib;
        b bVar = e;
        if (bVar == null || bVar.a != i) {
            return false;
        }
        u2b0 u2b0Var = c;
        return (u2b0Var.x0().Ib() == null || (Ib = u2b0Var.x0().Ib()) == null || Ib.intValue() != i) ? false : true;
    }
}
