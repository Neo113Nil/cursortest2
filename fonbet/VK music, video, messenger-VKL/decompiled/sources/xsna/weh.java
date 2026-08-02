package xsna;

import android.content.Context;
import com.vk.repository.data.api.ExtendedProfilesRepository;

/* compiled from: CommunityProfileChannelFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class weh {
    public static final String e = i5s.a(new StringBuilder("https://"), a0a.d, "/im/channels/");
    public final Context a;
    public final ExtendedProfilesRepository b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final o99 d;

    public weh(Context context, ExtendedProfilesRepository extendedProfilesRepository, io.reactivex.rxjava3.disposables.b bVar, o99 o99Var) {
        this.a = context;
        this.b = extendedProfilesRepository;
        this.c = bVar;
        this.d = o99Var;
    }
}
