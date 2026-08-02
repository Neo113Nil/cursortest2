package com.ybsdk.core.utils.text;

import android.content.Context;
import android.content.res.Resources;
import com.ybsdk.core.utils.text.Text;
import defpackage.cvu0;
import defpackage.e5z0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.i5z0;
import defpackage.iqy0;
import defpackage.w511;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class d {
    public static final CharSequence a(Context context, Text text) {
        Object a;
        if (text instanceof Text.Empty) {
            return "";
        }
        if (text instanceof Text.Constant) {
            return ((Text.Constant) text).getText();
        }
        if (text instanceof Text.Resource) {
            return context.getString(((Text.Resource) text).getStringResId());
        }
        if (text instanceof Text.Plural) {
            Text.Plural plural = (Text.Plural) text;
            try {
                return context.getResources().getQuantityString(plural.getPluralsResId(), plural.getQuantity(), Arrays.copyOf(new Object[]{Integer.valueOf(plural.getQuantity())}, 1));
            } catch (Resources.NotFoundException e) {
                e5z0 e5z0Var = i5z0.a;
                e5z0Var.m("Context.quantityString");
                e5z0Var.f(e, "Failed to get quantity string", new Object[0]);
                return "";
            }
        }
        if (!(text instanceof Text.Formatted)) {
            if (text instanceof Text.Join) {
                Text.Join join = (Text.Join) text;
                return kotlin.collections.a.X(join.getTexts(), join.getSeparator(), null, null, new iqy0(context, 0), 30);
            }
            if (!(text instanceof Text.WithHtmlLink)) {
                w511.b();
                return null;
            }
            Text.WithHtmlLink withHtmlLink = (Text.WithHtmlLink) text;
            String obj = a(context, withHtmlLink.getTextToLink()).toString();
            return cvu0.v(a(context, withHtmlLink.getOrigin()).toString(), obj, String.format("<a href=\"%s\">%s</a>", Arrays.copyOf(new Object[]{withHtmlLink.getLink(), obj}, 2)), false);
        }
        Text.Formatted formatted = (Text.Formatted) text;
        int stringResId = formatted.getStringResId();
        List<Text.Formatted.Arg> args = formatted.getArgs();
        int size = args.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Text.Formatted.Arg arg = args.get(i);
            if (arg instanceof Text.Formatted.Arg.IntArg) {
                a = Integer.valueOf(((Text.Formatted.Arg.IntArg) arg).getArg());
            } else if (arg instanceof Text.Formatted.Arg.StringArg) {
                a = ((Text.Formatted.Arg.StringArg) arg).getArg();
            } else {
                if (!(arg instanceof Text.Formatted.Arg.TextArg)) {
                    w511.b();
                    return null;
                }
                a = a(context, ((Text.Formatted.Arg.TextArg) arg).getArg());
            }
            objArr[i] = a;
        }
        return context.getString(stringResId, Arrays.copyOf(objArr, size));
    }

    public static final boolean b(Text text) {
        if (text instanceof Text.Empty) {
            return false;
        }
        return ((text instanceof Text.Constant) && evu0.J(((Text.Constant) text).getText())) ? false : true;
    }

    public static final boolean c(Text text) {
        if (text == null || (text instanceof Text.Empty)) {
            return false;
        }
        return ((text instanceof Text.Constant) && evu0.J(((Text.Constant) text).getText())) ? false : true;
    }

    public static final boolean d(Text text) {
        if (text == null || (text instanceof Text.Empty)) {
            return true;
        }
        return (text instanceof Text.Constant) && evu0.J(((Text.Constant) text).getText());
    }

    public static final Text.Constant e(String str) {
        return g8e.i(Text.Companion, str);
    }

    public static final Text f(String str) {
        Text.Constant g = g(str);
        return g == null ? Text.Empty.INSTANCE : g;
    }

    public static final Text.Constant g(String str) {
        if (str != null) {
            return g8e.i(Text.Companion, str);
        }
        return null;
    }
}
