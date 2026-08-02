package xsna;

import android.os.Bundle;
import android.widget.EditText;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.util.CommentDraft;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import xsna.l2f;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vyb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vyb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        String str;
        switch (this.b) {
            case 0:
                xyb xybVar = (xyb) this.c;
                xybVar.u = null;
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    azbVar.b();
                    break;
                }
                break;
            case 1:
                ((l2f.a) this.c).a(null);
                break;
            case 2:
                ((bq60) this.c).a(yo60.e.a.a);
                break;
            case 3:
                m3g0 m3g0Var = (m3g0) this.c;
                boolean d0 = m3g0Var.d0();
                CommentDraft commentDraft = m3g0Var.m;
                if (d0) {
                    NewsComment newsComment = commentDraft.b;
                    String str2 = newsComment.b;
                    if ((str2 == null || str2.length() == 0) && (str = m3g0Var.q) != null && str.length() != 0) {
                        newsComment.b = m3g0Var.q;
                        m3g0Var.q = null;
                    }
                    u3g0 u3g0Var = m3g0Var.c;
                    u3g0Var.n = true;
                    EditText editText = u3g0Var.f;
                    if (editText != null) {
                        editText.setText(newsComment.b);
                    }
                    WriteBar writeBar = u3g0Var.e;
                    if (writeBar != null) {
                        writeBar.F();
                    }
                    ArrayList<Attachment> arrayList = newsComment.J;
                    if (arrayList != null) {
                        for (Attachment attachment : arrayList) {
                            WriteBar writeBar2 = u3g0Var.e;
                            if (writeBar2 != null) {
                                writeBar2.A1(attachment);
                            }
                        }
                    }
                    EditText editText2 = u3g0Var.f;
                    if (editText2 != null) {
                        editText2.setSelection(editText2.length());
                    }
                    u3g0Var.n = false;
                    Bundle bundle = commentDraft.c;
                    if (bundle != null) {
                        m3g0Var.g0(bundle);
                        break;
                    }
                }
                break;
            default:
                ((b9s0) this.c).D.getClass();
                break;
        }
    }
}
