package xsna;

import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.vk.dto.user.UserSex;
import com.vkontakte.android.R;

/* compiled from: PlaylistsEmptyFilterResultViewHolder.kt */
/* loaded from: classes3.dex */
public final class nfb0 {
    public final ScrollView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    /* compiled from: PlaylistsEmptyFilterResultViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserSex.values().length];
            try {
                iArr[UserSex.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserSex.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nfb0(ScrollView scrollView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = scrollView;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
    }

    public static void a(TextView textView, fsv fsvVar) {
        textView.setVisibility(0);
        textView.setText(R.string.music_playlists_empty_btn_go_to_reccomendations);
        textView.setOnClickListener(new gsg(1, fsvVar, textView));
    }
}
