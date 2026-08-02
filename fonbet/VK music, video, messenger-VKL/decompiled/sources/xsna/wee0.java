package xsna;

import com.vk.dto.newsfeed.Owner;

/* compiled from: Publishable.kt */
/* loaded from: classes18.dex */
public interface wee0 {
    Owner G();

    default void P4(Owner owner) {
        Owner G = G();
        if (G != null) {
            G.u(owner);
        }
    }
}
