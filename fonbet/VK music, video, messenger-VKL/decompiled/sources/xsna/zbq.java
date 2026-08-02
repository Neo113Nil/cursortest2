package xsna;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vkontakte.android.R;
import xsna.nv90;

/* compiled from: ExtendedPeopleFilterDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class zbq implements xbq {
    public final nv90.a a;
    public TextView b;
    public ImageView c;
    public EditText d;
    public boolean e;

    public zbq(nv90.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.xbq
    public final void a(View view) {
        view.setBackground(null);
        bwt0.p(view, R.id.education_container, null, new n6f(this, 22), 2);
        this.d = (EditText) bwt0.p(view, R.id.work_param_value, null, new zqh(this, 14), 2);
        this.b = (TextView) bwt0.p(view, R.id.education_param_value, null, null, 6);
        this.c = (ImageView) bwt0.p(view, R.id.education_param_chevron, null, null, 6);
    }

    @Override // xsna.xbq
    public final void b(FragmentManager fragmentManager) {
        fragmentManager.e("search_people_filter_education_param");
    }

    @Override // xsna.xbq
    public final void c(FragmentManager fragmentManager, f5z f5zVar) {
        fragmentManager.l0("search_people_filter_education_param", f5zVar, new j7(this, 21));
    }

    @Override // xsna.xbq
    public final void d(VkPeopleSearchParams vkPeopleSearchParams) {
        String str;
        EditText editText;
        this.e = true;
        EducationParam educationParam = vkPeopleSearchParams.g;
        if (educationParam != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(educationParam.b.getTitle());
            sb.append(" (");
            String a = ho8.a(sb, educationParam.c.c, ')');
            Integer num = educationParam.d;
            str = j5g.g0(rl3.I(new String[]{a, num != null ? num.toString() : null}), ", ", null, null, 0, null, 62);
        } else {
            str = null;
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        }
        int a2 = (str == null || str.length() == 0) ? iah0.a(8) : 0;
        ImageView imageView = this.c;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != a2) {
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = a2;
                imageView.setLayoutParams(marginLayoutParams2);
            }
        }
        String str2 = vkPeopleSearchParams.h;
        EditText editText2 = this.d;
        Editable text = editText2 != null ? editText2.getText() : null;
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        String obj2 = drm0.p0(obj).toString();
        if (!epx.f(myc0.f(obj2) ? obj2 : null, str2) && (editText = this.d) != null) {
            editText.setText(str2);
        }
        this.e = false;
    }
}
