package xsna;

import android.content.Context;
import android.widget.EditText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import java.util.List;

/* compiled from: PosterPostingContract.kt */
/* loaded from: classes3.dex */
public interface rac0 extends jk6<qac0>, hng0 {
    void E5(int i);

    CharSequence F5();

    void Hd(Poster.Constants constants);

    void U4(int i, UserId userId, boolean z);

    void Vi(PosterBackground posterBackground);

    int Zj();

    void clearFocus();

    void d1(int i);

    void di(List<PosterBackground> list);

    Context getContext();

    void ih(UserId userId, String str);

    void k();

    EditText l0();

    void m8();

    void q2(int i);

    void setText(CharSequence charSequence);

    int t1();

    void vi(String str);

    void w();

    void xe(String str);

    void zj(boolean z, kor korVar);
}
