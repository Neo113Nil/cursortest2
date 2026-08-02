package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: StoryLinkCreateView.kt */
/* loaded from: classes6.dex */
public final class m5m0 extends LinearLayout {
    public final s5m0 b;
    public final c7l0 c;
    public gzs<s3q0> d;
    public izs<? super a, s3q0> e;
    public final VkFormField f;
    public final VkInputSelect g;
    public final VkInputSelect h;
    public final VkInputSelect i;

    /* compiled from: StoryLinkCreateView.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final c7l0 c;

        public a(String str, String str2, c7l0 c7l0Var) {
            this.a = str;
            this.b = str2;
            this.c = c7l0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m5m0(l7s l7sVar, s5m0 s5m0Var, c7l0 c7l0Var) {
        super(l7sVar);
        this.b = s5m0Var;
        this.c = c7l0Var;
        View.inflate(l7sVar, R.layout.story_link_create_view, this);
        setOrientation(1);
        VkFormField vkFormField = (VkFormField) findViewById(R.id.url_form_field);
        this.f = vkFormField;
        VkInputSelect vkInputSelect = (VkInputSelect) findViewById(R.id.url_input);
        this.g = vkInputSelect;
        this.h = (VkInputSelect) findViewById(R.id.name_input);
        this.i = vkInputSelect;
        VkTopBar vkTopBar = (VkTopBar) findViewById(R.id.toolbar);
        vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.close), new avj0(this, 9), null, null, 12));
        Object[] objArr = 0 == true ? 1 : 0;
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.story_link_creation_dialog_title), objArr, null, null, null, 30), cVar, objArr2, objArr3, 14));
        vkFormField.setError(l7sVar.getString(R.string.story_link_incorrect_link));
        vkFormField.setError(false);
    }

    public final View getKeyboardFocusView() {
        return this.i;
    }

    public final gzs<s3q0> getOnCloseBtnClickListener() {
        return this.d;
    }

    public final izs<a, s3q0> getOnResultListener() {
        return this.e;
    }

    public final void setOnCloseBtnClickListener(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
    }

    public final void setOnResultListener(izs<? super a, s3q0> izsVar) {
        this.e = izsVar;
    }
}
