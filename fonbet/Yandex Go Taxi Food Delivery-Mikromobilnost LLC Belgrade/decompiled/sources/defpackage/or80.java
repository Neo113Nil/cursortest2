package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yandex.dsl.views.d;
import com.yandex.messaging.views.WaveformView;

/* loaded from: classes15.dex */
public final class or80 extends d implements ms11 {
    public final TextView A;
    public final WaveformView B;
    public final ImageButton C;
    public final /* synthetic */ int w;
    public final View x;
    public final ViewGroup y;
    public final View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or80(FragmentActivity fragmentActivity, int i) {
        super(fragmentActivity, olh0.msg_vh_chat_other_stub_voice_message);
        this.w = i;
        switch (i) {
            case 1:
                super(fragmentActivity, olh0.msg_vh_chat_own_stub_voice_message);
                this.x = this.c.a(e9h0.message_content);
                this.y = (ViewGroup) this.c.a(e9h0.recognizing_group);
                this.z = this.c.a(e9h0.recognizing);
                this.A = (TextView) this.c.a(e9h0.recognized_text);
                this.B = (WaveformView) this.c.a(e9h0.waveform);
                this.C = (ImageButton) this.c.a(e9h0.dialog_file_button);
                break;
            default:
                this.x = this.c.a(e9h0.timeline_message_container);
                this.y = (ViewGroup) this.c.a(e9h0.recognizing_group);
                this.z = this.c.a(e9h0.recognizing);
                this.A = (TextView) this.c.a(e9h0.recognized_text);
                this.B = (WaveformView) this.c.a(e9h0.waveform);
                this.C = (ImageButton) this.c.a(e9h0.dialog_file_button);
                break;
        }
    }

    public final TextView a() {
        switch (this.w) {
        }
        return this.A;
    }

    public final ViewGroup b() {
        switch (this.w) {
        }
        return this.y;
    }

    public final WaveformView c() {
        switch (this.w) {
        }
        return this.B;
    }
}
