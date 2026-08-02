package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: AudioBookPersonDescriptionBottomSheet.kt */
/* loaded from: classes3.dex */
public final class di4 extends dw20 {

    /* compiled from: AudioBookPersonDescriptionBottomSheet.kt */
    public static final class a extends dw20.b {
        public final MusicPlaybackLaunchContext e;

        /* compiled from: AudioBookPersonDescriptionBottomSheet.kt */
        /* renamed from: xsna.di4$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2738a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AudioBookPersonRole.values().length];
                try {
                    iArr[AudioBookPersonRole.NARRATOR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Activity activity, String str, String str2, AudioBookPersonRole audioBookPersonRole, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            super(activity, tzp0.a(null, 3));
            this.e = musicPlaybackLaunchContext;
            View inflate = LayoutInflater.from(activity).inflate(R.layout.audiobook_about_person, (ViewGroup) null, false);
            inflate.setBackground(gu9.d(activity, null));
            ((TextView) inflate.findViewById(R.id.person_name)).setText(str);
            ((TextView) inflate.findViewById(R.id.header_tv)).setText(C2738a.$EnumSwitchMapping$0[audioBookPersonRole.ordinal()] == 1 ? activity.getString(R.string.audio_book_person_about_narrator) : activity.getString(R.string.audio_book_person_about_author));
            ((TextView) inflate.findViewById(R.id.person_full_description_tv)).setText(str2);
            D0(inflate, false);
            c(new jgj(inflate, 0, 0, 46));
            F0(true);
            R0(false);
            q0(false);
            x(0);
            u(0);
            S(e3m.f(R.attr.vk_ui_background_modal, activity));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            di4 di4Var = new di4();
            Bundle bundle = new Bundle();
            bundle.putString("ref", this.e.t());
            di4Var.setArguments(bundle);
            return di4Var;
        }
    }
}
