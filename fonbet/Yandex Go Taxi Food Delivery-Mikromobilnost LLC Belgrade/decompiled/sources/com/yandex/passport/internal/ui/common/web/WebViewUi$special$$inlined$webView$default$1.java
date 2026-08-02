package com.yandex.passport.internal.ui.common.web;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lightside.slab.SlotView;
import defpackage.er31;
import defpackage.l521;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class WebViewUi$special$$inlined$webView$default$1 extends FunctionReferenceImpl implements zls {
    public static final WebViewUi$special$$inlined$webView$default$1 b = new WebViewUi$special$$inlined$webView$default$1();

    public WebViewUi$special$$inlined$webView$default$1() {
        super(3, 1, er31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue == 0 && intValue2 == 0) {
            return (WebView) ((WebView.class.equals(TextView.class) || WebView.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : WebView.class.equals(Button.class) ? new Button(context) : (WebView.class.equals(ImageView.class) || WebView.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (WebView.class.equals(EditText.class) || WebView.class.equals(AppCompatEditText.class)) ? new AppCompatEditText(context) : WebView.class.equals(Spinner.class) ? new Spinner(context) : (WebView.class.equals(ImageButton.class) || WebView.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (WebView.class.equals(CheckBox.class) || WebView.class.equals(AppCompatCheckBox.class)) ? new AppCompatCheckBox(context) : (WebView.class.equals(RadioButton.class) || WebView.class.equals(AppCompatRadioButton.class)) ? new AppCompatRadioButton(context) : WebView.class.equals(RadioGroup.class) ? new RadioGroup(context) : WebView.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : WebView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : WebView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (WebView.class.equals(RatingBar.class) || WebView.class.equals(AppCompatRatingBar.class)) ? new AppCompatRatingBar(context) : (WebView.class.equals(SeekBar.class) || WebView.class.equals(AppCompatSeekBar.class)) ? new AppCompatSeekBar(context) : WebView.class.equals(ProgressBar.class) ? new ProgressBar(context) : WebView.class.equals(Space.class) ? new Space(context) : WebView.class.equals(RecyclerView.class) ? new RecyclerView(context) : WebView.class.equals(View.class) ? new View(context) : WebView.class.equals(Toolbar.class) ? new Toolbar(context) : WebView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : WebView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : l521.b(context, WebView.class));
        }
        return (WebView) (WebView.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : WebView.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : WebView.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : WebView.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : WebView.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : WebView.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : WebView.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : WebView.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : WebView.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : WebView.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : WebView.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : WebView.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : WebView.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : WebView.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : WebView.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : WebView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : WebView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : WebView.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : WebView.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : WebView.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : WebView.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : WebView.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : WebView.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : WebView.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : WebView.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : WebView.class.equals(View.class) ? new View(context, null, intValue, intValue2) : WebView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : WebView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : WebView.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : l521.a(WebView.class, context, intValue, intValue2));
    }
}
